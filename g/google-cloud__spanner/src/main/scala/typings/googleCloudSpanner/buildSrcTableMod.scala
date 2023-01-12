package typings.googleCloudSpanner

import typings.googleCloudSpanner.buildSrcCommonMod.LongRunningCallback
import typings.googleCloudSpanner.buildSrcCommonMod.Schema
import typings.googleCloudSpanner.buildSrcDatabaseMod.Database
import typings.googleCloudSpanner.buildSrcDatabaseMod.UpdateSchemaCallback
import typings.googleCloudSpanner.buildSrcDatabaseMod.UpdateSchemaResponse
import typings.googleCloudSpanner.buildSrcPartialResultStreamMod.PartialResultStream_
import typings.googleCloudSpanner.buildSrcTransactionMod.CommitCallback
import typings.googleCloudSpanner.buildSrcTransactionMod.CommitOptions
import typings.googleCloudSpanner.buildSrcTransactionMod.CommitResponse
import typings.googleCloudSpanner.buildSrcTransactionMod.ReadCallback
import typings.googleCloudSpanner.buildSrcTransactionMod.ReadRequest
import typings.googleCloudSpanner.buildSrcTransactionMod.ReadResponse
import typings.googleCloudSpanner.buildSrcTransactionMod.TimestampBounds
import typings.googleCloudSpanner.googleCloudSpannerStrings.requestTag
import typings.googleGax.buildSrcGaxMod.CallOptions
import typings.googleGax.mod.Operation_
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTableMod {
  
  /**
    * Create a Table object to interact with a table in a Cloud Spanner
    * database.
    *
    * @class
    *
    * @param {Database} database {@link Database} instance.
    * @param {string} name Name of the table.
    *
    * @example
    * ```
    * const {Spanner} = require('@google-cloud/spanner');
    * const spanner = new Spanner();
    *
    * const instance = spanner.instance('my-instance');
    * const database = instance.database('my-database');
    * const table = database.table('my-table');
    * ```
    */
  @JSImport("@google-cloud/spanner/build/src/table", "Table")
  @js.native
  open class Table protected () extends StObject {
    def this(database: Database, name: String) = this()
    
    /**
      * Creates a new transaction and applies the desired mutation via
      * {@link Transaction#commit}.
      *
      * @see [Commit API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.Commit)
      *
      * @private
      *
      * @param {string} method CRUD method (insert, update, etc.).
      * @param {object|object[]} rows A map of names to values of data to insert
      *     into this table.
      * @param {function} callback The callback function.
      */
    /* private */ var _mutate: Any = js.native
    
    /**
      * Create a table.
      *
      * @param {string} schema See {@link Database#createTable}.
      * @param {object} [gaxOptions]
      *     Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {CreateTableCallback} [callback] Callback function.
      * @returns {Promise<CreateTableResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      * const table = database.table('Singers');
      *
      * const schema =
      *   'CREATE TABLE Singers (' +
      *   '  SingerId INT64 NOT NULL,' +
      *   '  FirstName STRING(1024),' +
      *   '  LastName STRING(1024),' +
      *   '  SingerInfo BYTES(MAX),' +
      *   ') PRIMARY KEY(SingerId)';
      *
      * table.create(schema, function(err, table, operation, apiResponse) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   operation
      *     .on('error', function(err) {})
      *     .on('complete', function() {
      *       // Table created successfully.
      *     });
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * table.create(schema)
      *   .then(function(data) {
      *     const table = data[0];
      *     const operation = data[1];
      *
      *     return operation.promise();
      *   })
      *   .then(function() {
      *     // Table created successfully.
      *   });
      * ```
      */
    def create(schema: Schema): js.Promise[CreateTableResponse] = js.native
    def create(schema: Schema, callback: CreateTableCallback): Unit = js.native
    def create(schema: Schema, gaxOptions: CallOptions): js.Promise[CreateTableResponse] = js.native
    def create(schema: Schema, gaxOptions: CallOptions, callback: CreateTableCallback): Unit = js.native
    
    /**
      * Create a readable object stream to receive rows from the database using key
      * lookups and scans.
      *
      * @see [StreamingRead API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.StreamingRead)
      * @see [ReadRequest API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.ReadRequest)
      *
      * @param {ReadRequest} query Configuration object, describing what to read from the table..
      * @param {TimestampBounds} [options] [Transaction options](https://cloud.google.com/spanner/docs/timestamp-bounds).
      * @returns {PartialResultStream} A readable stream that emits rows.
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      * const table = database.table('Singers');
      *
      * table.createReadStream({
      *     keys: ['1'],
      *     columns: ['SingerId', 'name']
      *   })
      *   .on('error', function(err) {})
      *   .on('data', function(row) {
      *     // row = {
      *     //   SingerId: '1',
      *     //   Name: 'Eddie Wilson'
      *     // }
      *   })
      *   .on('end', function() {
      *     // All results retrieved.
      *   });
      *
      * //-
      * // Provide an array for `query.keys` to read with a composite key.
      * //-
      * const query = {
      *   keys: [
      *     [
      *       'Id1',
      *       'Name1'
      *     ],
      *     [
      *       'Id2',
      *       'Name2'
      *     ]
      *   ],
      *   // ...
      * };
      *
      * //-
      * // If you anticipate many results, you can end a stream early to prevent
      * // unnecessary processing and API requests.
      * //-
      * table.createReadStream({
      *     keys: ['1'],
      *     columns: ['SingerId', 'name']
      *   })
      *   .on('data', function(row) {
      *     this.end();
      *   });
      * ```
      */
    def createReadStream(request: ReadRequest): PartialResultStream_ = js.native
    def createReadStream(request: ReadRequest, options: TimestampBounds): PartialResultStream_ = js.native
    
    var database: Database = js.native
    
    /**
      * @typedef {array} DropTableResponse
      * @property {google.longrunning.Operation} 0 An {@link Operation} object that can be used to check
      *     the status of the request.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback DropTableCallback
      * @param {?Error} err Request error, if any.
      * @param {google.longrunning.Operation} operation An {@link Operation} object that can be used to
      *     check the status of the request.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Delete the table. Not to be confused with {@link Table#deleteRows}.
      *
      * Wrapper around {@link Database#updateSchema}.
      *
      * @see {@link Database#updateSchema}
      *
      * @throws {TypeError} If any arguments are passed in.
      * @param {object} [gaxOptions]
      *     Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {DropTableCallback} [callback] Callback function.
      * @returns {Promise<DropTableResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      * const table = database.table('Singers');
      *
      * table.delete(function(err, operation, apiResponse) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   operation
      *     .on('error', function(err) {})
      *     .on('complete', function() {
      *       // Table deleted successfully.
      *     });
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * table.delete()
      *   .then(function(data) {
      *     const operation = data[0];
      *     return operation.promise();
      *   })
      *   .then(function() {
      *     // Table deleted successfully.
      *   });
      * ```
      */
    def delete(): js.Promise[DropTableResponse] = js.native
    def delete(callback: DropTableCallback): Unit = js.native
    def delete(gaxOptions: CallOptions): js.Promise[DropTableResponse] = js.native
    def delete(gaxOptions: CallOptions, callback: DropTableCallback): Unit = js.native
    
    /**
      * @typedef {array} DeleteRowsResponse
      * @property {CommitResponse} 0 The commit response.
      */
    /**
      * @callback DeleteRowsCallback
      * @param {?Error} error Request error, if any.
      * @param {CommitResponse} apiResponse The full API response.
      */
    /**
      * @typedef {object} DeleteRowsOptions
      * @property {google.spanner.v1.IRequestOptions} requestOptions The request options to include
      *     with the commit request.
      * @property {boolean} returnCommitStats Include statistics related to the
      *     transaction in the {@link CommitResponse}.
      * @property {object} [gaxOptions]
      *     Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      */
    /**
      * Delete rows from this table.
      *
      * @see [Commit API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.Commit)
      *
      * @param {array} keys The keys for the rows to delete. If using a
      *     composite key, provide an array within this array. See the example
      * below.
      * @param {DeleteRowsOptions|CallOptions} [options] Options for configuring the request.
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {DeleteRowsCallback} [callback] Callback function.
      * @returns {Promise<DeleteRowsResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      * const table = database.table('Singers');
      *
      * const keys = ['Id1', 'Id2', 'Id3'];
      *
      * table.deleteRows(keys, function(err, apiResponse) {});
      *
      * //-
      * // Provide an array for `keys` to delete rows with a composite key.
      * //-
      * const keys = [
      *   [
      *     'Id1',
      *     'Name1'
      *   ],
      *   [
      *     'Id2',
      *     'Name2'
      *   ]
      * ];
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * table.deleteRows(keys)
      *   .then(function(data) {
      *     const apiResponse = data[0];
      *   });
      * ```
      */
    def deleteRows(keys: js.Array[Key]): js.Promise[DeleteRowsResponse] = js.native
    def deleteRows(keys: js.Array[Key], callback: DeleteRowsCallback): Unit = js.native
    def deleteRows(keys: js.Array[Key], options: DeleteRowsOptions): js.Promise[DeleteRowsResponse] = js.native
    def deleteRows(keys: js.Array[Key], options: DeleteRowsOptions, callback: DeleteRowsCallback): Unit = js.native
    def deleteRows(keys: js.Array[Key], options: CallOptions): js.Promise[DeleteRowsResponse] = js.native
    def deleteRows(keys: js.Array[Key], options: CallOptions, callback: DeleteRowsCallback): Unit = js.native
    
    /**
      * Drop the table.
      *
      * @see {@link Table#delete}
      * @see {@link Database#updateSchema}
      *
      * @param {object} [gaxOptions] Request configuration options.
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {DropTableCallback} [callback] Callback function.
      * @returns {Promise<DropTableResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      * const table = database.table('Singers');
      *
      * table.drop(function(err, operation, apiResponse) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   operation
      *     .on('error', function(err) {})
      *     .on('complete', function() {
      *       // Table dropped successfully.
      *     });
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * table.drop()
      *   .then(function(data) {
      *     const operation = data[0];
      *     return operation.promise();
      *   })
      *   .then(function() {
      *     // Table dropped successfully.
      *   });
      * ```
      */
    def drop(): js.Promise[DropTableResponse] = js.native
    def drop(callback: DropTableCallback): Unit = js.native
    def drop(gaxOptions: CallOptions): js.Promise[DropTableResponse] = js.native
    def drop(gaxOptions: CallOptions, callback: DropTableCallback): Unit = js.native
    
    def insert(rows: js.Array[js.Object]): js.Promise[InsertRowsResponse] = js.native
    def insert(rows: js.Array[js.Object], callback: InsertRowsCallback): Unit = js.native
    def insert(rows: js.Array[js.Object], options: InsertRowsOptions): js.Promise[InsertRowsResponse] = js.native
    def insert(rows: js.Array[js.Object], options: InsertRowsOptions, callback: InsertRowsCallback): Unit = js.native
    def insert(rows: js.Array[js.Object], options: CallOptions): js.Promise[InsertRowsResponse] = js.native
    def insert(rows: js.Array[js.Object], options: CallOptions, callback: InsertRowsCallback): Unit = js.native
    /**
      * @typedef {array} InsertRowsResponse
      * @property {CommitResponse} 0 The commit response.
      */
    /**
      * @callback InsertRowsCallback
      * @param {?Error} error Request error, if any.
      * @param {CommitResponse} apiResponse The full API response.
      */
    /**
      * @typedef {object} InsertRowsOptions
      * @property {google.spanner.v1.IRequestOptions} requestOptions The request options to include
      *     with the commit request.
      * @property {boolean} returnCommitStats Include statistics related to the
      *     transaction in the {@link CommitResponse}.
      * @property {object} [gaxOptions]
      *     Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      */
    /**
      * Insert rows of data into this table.
      *
      * @see [Commit API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.Commit)
      *
      * @param {object|object[]} rows A map of names to values of data to insert
      *     into this table.
      * @param {InsertRowsOptions|CallOptions} [options] Options for configuring the request.
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {InsertRowsCallback} [callback] Callback function.
      * @returns {Promise<InsertRowsResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      * const table = database.table('Singers');
      *
      * const row = {
      *   SingerId: 'Id3',
      *   Name: 'Eddie Wilson'
      * };
      *
      * table.insert(row, function(err, apiResponse) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // Rows inserted successfully.
      * });
      *
      * //-
      * // Multiple rows can be inserted at once.
      * //-
      * const row2 = {
      *   SingerId: 'Id3b',
      *   Name: 'Joe West'
      * };
      *
      * table.insert([
      *   row,
      *   row2
      * ], function(err, apiResponse) {});
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * table.insert(row)
      *   .then(function(data) {
      *     const apiResponse = data[0];
      *   });
      *
      * ```
      * @example <caption>include:samples/crud.js</caption>
      * region_tag:spanner_insert_data
      * Full example:
      */
    def insert(rows: js.Object): js.Promise[InsertRowsResponse] = js.native
    def insert(rows: js.Object, callback: InsertRowsCallback): Unit = js.native
    def insert(rows: js.Object, options: InsertRowsOptions): js.Promise[InsertRowsResponse] = js.native
    def insert(rows: js.Object, options: InsertRowsOptions, callback: InsertRowsCallback): Unit = js.native
    def insert(rows: js.Object, options: CallOptions): js.Promise[InsertRowsResponse] = js.native
    def insert(rows: js.Object, options: CallOptions, callback: InsertRowsCallback): Unit = js.native
    
    var name: String = js.native
    
    /**
      * Configuration object, describing what to read from the table.
      */
    /**
      * @typedef {array} TableReadResponse
      * @property {array[]} 0 Rows are returned as an array of object arrays. Each
      *     object has a `name` and `value` property. To get a serialized object,
      *     call `toJSON()`. Optionally, provide an options object to `toJSON()`
      *     specifying `wrapNumbers: true` to protect large integer values outside
      * of the range of JavaScript Number. If set, FLOAT64 values will be returned
      *     as {@link Spanner.Float} objects and INT64 values as {@link
      * Spanner.Int}.
      */
    /**
      * @callback TableReadCallback
      * @param {?Error} err Request error, if any.
      * @param {array[]} rows Rows are returned as an array of object arrays. Each
      *     object has a `name` and `value` property. To get a serialized object,
      *     call `toJSON()`. Optionally, provide an options object to `toJSON()`
      *     specifying `wrapNumbers: true` to protect large integer values outside
      * of the range of JavaScript Number. If set, FLOAT64 values will be returned
      *     as {@link Spanner.Float} objects and INT64 values as {@link
      * Spanner.Int}.
      */
    /**
      * Receive rows from the database using key lookups and scans.
      *
      * **Performance Considerations:**
      *
      * This method wraps the streaming method,
      * {@link Table#createReadStream} for your convenience. All rows will
      * be stored in memory before being released to your callback. If you intend
      * on receiving a lot of results from your query, consider using the streaming
      * method, so you can free each result from memory after consuming it.
      *
      * @param {ReadRequest} query Configuration object, describing
      *     what to read from the table.
      * @param {TimestampBounds} options [Transaction options](https://cloud.google.com/spanner/docs/timestamp-bounds).
      * @param {TableReadCallback} [callback] Callback function.
      * @returns {Promise<TableReadResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      * const table = database.table('Singers');
      *
      * const query = {
      *   keys: ['1'],
      *   columns: ['SingerId', 'name']
      * };
      *
      * table.read(query, function(err, rows) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   const firstRow = rows[0];
      *
      *   // firstRow = [
      *   //   {
      *   //     name: 'SingerId',
      *   //     value: '1'
      *   //   },
      *   //   {
      *   //     name: 'Name',
      *   //     value: 'Eddie Wilson'
      *   //   }
      *   // ]
      * });
      *
      * //-
      * // Provide an array for `query.keys` to read with a composite key.
      * //-
      * const query = {
      *   keys: [
      *     [
      *       'Id1',
      *       'Name1'
      *     ],
      *     [
      *       'Id2',
      *       'Name2'
      *     ]
      *   ],
      *   // ...
      * };
      *
      * //-
      * // Rows are returned as an array of object arrays. Each object has a `name`
      * // and `value` property. To get a serialized object, call `toJSON()`.
      * //
      * // Alternatively, set `query.json` to `true`, and this step will be
      * performed
      * // automatically.
      * //-
      * table.read(query, function(err, rows) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   const firstRow = rows[0];
      *
      *   // firstRow.toJSON() = {
      *   //   SingerId: '1',
      *   //   Name: 'Eddie Wilson'
      *   // }
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * table.read(query)
      *   .then(function(data) {
      *     const rows = data[0];
      *   });
      *
      * ```
      * @example <caption>include:samples/crud.js</caption>
      * region_tag:spanner_read_data
      * Full example:
      *
      * @example <caption>include:samples/crud.js</caption>
      * region_tag:spanner_read_stale_data
      * Reading stale data:
      *
      * @example <caption>include:samples/index-read-data.js</caption>
      * region_tag:spanner_read_data_with_index
      * Reading data using an index:
      *
      * @example <caption>include:samples/index-read-data-with-storing.js</caption>
      * region_tag:spanner_read_data_with_storing_index
      * Reading data using a storing index:
      */
    def read(request: ReadRequest): js.Promise[ReadResponse] = js.native
    def read(request: ReadRequest, callback: ReadCallback): Unit = js.native
    def read(request: ReadRequest, options: TimestampBounds): js.Promise[ReadResponse] = js.native
    def read(request: ReadRequest, options: TimestampBounds, callback: ReadCallback): Unit = js.native
    
    def replace(rows: js.Array[js.Object]): js.Promise[ReplaceRowsResponse] = js.native
    def replace(rows: js.Array[js.Object], callback: ReplaceRowsCallback): Unit = js.native
    def replace(rows: js.Array[js.Object], options: ReplaceRowsOptions): js.Promise[ReplaceRowsResponse] = js.native
    def replace(rows: js.Array[js.Object], options: ReplaceRowsOptions, callback: ReplaceRowsCallback): Unit = js.native
    def replace(rows: js.Array[js.Object], options: CallOptions): js.Promise[ReplaceRowsResponse] = js.native
    def replace(rows: js.Array[js.Object], options: CallOptions, callback: ReplaceRowsCallback): Unit = js.native
    /**
      * @typedef {array} ReplaceRowsResponse
      * @property {CommitResponse} 0 The commit response.
      */
    /**
      * @callback ReplaceRowsCallback
      * @param {?Error} error Request error, if any.
      * @param {CommitResponse} apiResponse The full API response.
      */
    /**
      * @typedef {object} ReplaceRowsOptions
      * @property {google.spanner.v1.IRequestOptions} requestOptions The request options to include
      *     with the commit request.
      * @property {boolean} returnCommitStats Include statistics related to the
      *     transaction in the {@link CommitResponse}.
      * @property {object} [gaxOptions]
      *     Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      */
    /**
      * Replace rows of data within this table.
      *
      * @see [Commit API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.Commit)
      *
      * @param {object|object[]} rows A map of names to values of data to insert
      *     into this table.
      * @param {ReplaceRowsOptions|CallOptions} [options] Options for configuring the request.
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {ReplaceRowsCallback} [callback] Callback function.
      * @returns {Promise<ReplaceRowsResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      * const table = database.table('Singers');
      *
      * const row = {
      *   SingerId: 'Id3',
      *   Name: 'Joe West'
      * };
      *
      * table.replace(row, function(err, apiResponse) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // Row replaced successfully.
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * table.replace(row)
      *   .then(function(data) {
      *     const apiResponse = data[0];
      *   });
      * ```
      */
    def replace(rows: js.Object): js.Promise[ReplaceRowsResponse] = js.native
    def replace(rows: js.Object, callback: ReplaceRowsCallback): Unit = js.native
    def replace(rows: js.Object, options: ReplaceRowsOptions): js.Promise[ReplaceRowsResponse] = js.native
    def replace(rows: js.Object, options: ReplaceRowsOptions, callback: ReplaceRowsCallback): Unit = js.native
    def replace(rows: js.Object, options: CallOptions): js.Promise[ReplaceRowsResponse] = js.native
    def replace(rows: js.Object, options: CallOptions, callback: ReplaceRowsCallback): Unit = js.native
    
    def update(rows: js.Array[js.Object]): js.Promise[UpdateRowsResponse] = js.native
    def update(rows: js.Array[js.Object], callback: UpdateRowsCallback): Unit = js.native
    def update(rows: js.Array[js.Object], options: UpdateRowsOptions): js.Promise[UpdateRowsResponse] = js.native
    def update(rows: js.Array[js.Object], options: UpdateRowsOptions, callback: UpdateRowsCallback): Unit = js.native
    def update(rows: js.Array[js.Object], options: CallOptions): js.Promise[UpdateRowsResponse] = js.native
    def update(rows: js.Array[js.Object], options: CallOptions, callback: UpdateRowsCallback): Unit = js.native
    /**
      * @typedef {array} UpdateRowsResponse
      * @property {CommitResponse} 0 The commit response.
      */
    /**
      * @callback UpdateRowsCallback
      * @param {?Error} error Request error, if any.
      * @param {CommitResponse} apiResponse The full API response.
      */
    /**
      * @typedef {object} UpdateRowsOptions
      * @property {google.spanner.v1.IRequestOptions} requestOptions The request options to include
      *     with the commit request.
      * @property {boolean} returnCommitStats Include statistics related to the
      *     transaction in the {@link CommitResponse}.
      * @property {object} [gaxOptions]
      *     Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      */
    /**
      * Update rows of data within this table.
      *
      * @see [Commit API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.Commit)
      *
      * @param {object|object[]} rows A map of names to values of data to insert
      *     into this table.
      * @param {UpdateRowsOptions|CallOptions} [options] Options for configuring the request.
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {UpdateRowsCallback} [callback] Callback function.
      * @returns {Promise<UpdateRowsResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      * const table = database.table('Singers');
      *
      * const row = {
      *   SingerId: 'Id3',
      *   Name: 'Joe West'
      * };
      *
      * table.update(row, function(err, apiResponse) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // Row updated successfully.
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * table.update(row)
      *   .then(function(data) {
      *     const apiResponse = data[0];
      *   });
      *
      * ```
      * @example <caption>include:samples/crud.js</caption>
      * region_tag:spanner_update_data
      * Full example:
      */
    def update(rows: js.Object): js.Promise[UpdateRowsResponse] = js.native
    def update(rows: js.Object, callback: UpdateRowsCallback): Unit = js.native
    def update(rows: js.Object, options: UpdateRowsOptions): js.Promise[UpdateRowsResponse] = js.native
    def update(rows: js.Object, options: UpdateRowsOptions, callback: UpdateRowsCallback): Unit = js.native
    def update(rows: js.Object, options: CallOptions): js.Promise[UpdateRowsResponse] = js.native
    def update(rows: js.Object, options: CallOptions, callback: UpdateRowsCallback): Unit = js.native
    
    def upsert(rows: js.Array[js.Object]): js.Promise[UpsertRowsResponse] = js.native
    def upsert(rows: js.Array[js.Object], callback: UpsertRowsCallback): Unit = js.native
    def upsert(rows: js.Array[js.Object], options: UpsertRowsOptions): js.Promise[UpsertRowsResponse] = js.native
    def upsert(rows: js.Array[js.Object], options: UpsertRowsOptions, callback: UpsertRowsCallback): Unit = js.native
    def upsert(rows: js.Array[js.Object], options: CallOptions): js.Promise[UpsertRowsResponse] = js.native
    def upsert(rows: js.Array[js.Object], options: CallOptions, callback: UpsertRowsCallback): Unit = js.native
    /**
      * @typedef {array} UpsertRowsResponse
      * @property {CommitResponse} 0 The commit response.
      */
    /**
      * @callback UpsertRowsCallback
      * @param {?Error} error Request error, if any.
      * @param {CommitResponse} apiResponse The full API response.
      */
    /**
      * @typedef {object} UpsertRowsOptions
      * @property {google.spanner.v1.IRequestOptions} requestOptions The request options to include
      *     with the commit request.
      * @property {boolean} returnCommitStats Include statistics related to the
      *     transaction in the {@link CommitResponse}.
      * @property {object} [gaxOptions]
      *     Call options. See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      */
    /**
      * Insert or update rows of data within this table.
      *
      * @see [Commit API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.Commit)
      *
      * @param {object|object[]} rows A map of names to values of data to insert
      *     into this table.
      *
      * @param {UpsertRowsOptions|CallOptions} [options] Options for configuring the request.
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {UpsertRowsCallback} [callback] Callback function.
      * @returns {Promise<UpsertRowsResponse>}
      *
      * @example
      * ```
      * const {Spanner} = require('@google-cloud/spanner');
      * const spanner = new Spanner();
      *
      * const instance = spanner.instance('my-instance');
      * const database = instance.database('my-database');
      * const table = database.table('Singers');
      *
      * const row = {
      *   SingerId: 'Id3',
      *   Name: 'Joe West'
      * };
      *
      * table.upsert(row, function(err, apiResponse) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // Row inserted or updated successfully.
      * });
      *
      * //-
      * // If the callback is omitted, we'll return a Promise.
      * //-
      * table.upsert(row)
      *   .then(function(data) {
      *     const apiResponse = data[0];
      *   });
      * ```
      */
    def upsert(rows: js.Object): js.Promise[UpsertRowsResponse] = js.native
    def upsert(rows: js.Object, callback: UpsertRowsCallback): Unit = js.native
    def upsert(rows: js.Object, options: UpsertRowsOptions): js.Promise[UpsertRowsResponse] = js.native
    def upsert(rows: js.Object, options: UpsertRowsOptions, callback: UpsertRowsCallback): Unit = js.native
    def upsert(rows: js.Object, options: CallOptions): js.Promise[UpsertRowsResponse] = js.native
    def upsert(rows: js.Object, options: CallOptions, callback: UpsertRowsCallback): Unit = js.native
  }
  
  type CreateTableCallback = LongRunningCallback[Table]
  
  type CreateTableResponse = js.Tuple3[
    Table, 
    Operation_, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify databaseAdmin.longrunning.IOperation */ Any
  ]
  
  type DeleteRowsCallback = CommitCallback
  
  type DeleteRowsOptions = MutateRowsOptions
  
  type DeleteRowsResponse = CommitResponse
  
  type DropTableCallback = UpdateSchemaCallback
  
  type DropTableResponse = UpdateSchemaResponse
  
  type InsertRowsCallback = CommitCallback
  
  type InsertRowsOptions = MutateRowsOptions
  
  type InsertRowsResponse = CommitResponse
  
  type Key = String | js.Array[String]
  
  trait MutateRowsOptions
    extends StObject
       with CommitOptions {
    
    @JSName("requestOptions")
    var requestOptions_MutateRowsOptions: js.UndefOr[
        Omit[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IRequestOptions */ Any, 
          requestTag
        ]
      ] = js.undefined
  }
  object MutateRowsOptions {
    
    inline def apply(): MutateRowsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MutateRowsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MutateRowsOptions] (val x: Self) extends AnyVal {
      
      inline def setRequestOptions(
        value: Omit[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IRequestOptions */ Any, 
              requestTag
            ]
      ): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    }
  }
  
  type ReplaceRowsCallback = CommitCallback
  
  type ReplaceRowsOptions = MutateRowsOptions
  
  type ReplaceRowsResponse = CommitResponse
  
  type UpdateRowsCallback = CommitCallback
  
  type UpdateRowsOptions = MutateRowsOptions
  
  type UpdateRowsResponse = CommitResponse
  
  type UpsertRowsCallback = CommitCallback
  
  type UpsertRowsOptions = MutateRowsOptions
  
  type UpsertRowsResponse = CommitResponse
}
