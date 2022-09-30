package typings.googleCloudSpanner.mod

import typings.googleCloudSpanner.databaseMod.SessionPoolConstructor
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.IQueryOptions
import typings.googleCloudSpanner.sessionPoolMod.SessionPoolOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a Database object to interact with a Cloud Spanner database.
  *
  * @class
  *
  * @param {string} name Name of the database.
  * @param {SessionPoolOptions|SessionPoolInterface} options Session pool
  *     configuration options or custom pool interface.
  * @param {google.spanner.v1.ExecuteSqlRequest.IQueryOptions} queryOptions
  *     The default query options to use for queries on the database.
  *
  * @example
  * ```
  * const {Spanner} = require('@google-cloud/spanner');
  * const spanner = new Spanner();
  * const instance = spanner.instance('my-instance');
  * const database = instance.database('my-database');
  * ```
  */
@JSImport("@google-cloud/spanner", "Database")
@js.native
open class Database protected ()
  extends typings.googleCloudSpanner.databaseMod.Database {
  def this(instance: typings.googleCloudSpanner.instanceMod.Instance, name: String) = this()
  def this(
    instance: typings.googleCloudSpanner.instanceMod.Instance,
    name: String,
    poolOptions: SessionPoolConstructor
  ) = this()
  def this(
    instance: typings.googleCloudSpanner.instanceMod.Instance,
    name: String,
    poolOptions: SessionPoolOptions
  ) = this()
  def this(
    instance: typings.googleCloudSpanner.instanceMod.Instance,
    name: String,
    poolOptions: Unit,
    queryOptions: IQueryOptions
  ) = this()
  def this(
    instance: typings.googleCloudSpanner.instanceMod.Instance,
    name: String,
    poolOptions: SessionPoolConstructor,
    queryOptions: IQueryOptions
  ) = this()
  def this(
    instance: typings.googleCloudSpanner.instanceMod.Instance,
    name: String,
    poolOptions: SessionPoolOptions,
    queryOptions: IQueryOptions
  ) = this()
}
object Database {
  
  @JSImport("@google-cloud/spanner", "Database")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Format the database name to include the instance name.
    *
    * @private
    *
    * @param {string} instanceName The formatted instance name.
    * @param {string} name The table name.
    * @returns {string}
    *
    * @example
    * ```
    * Database.formatName_(
    *   'projects/grape-spaceship-123/instances/my-instance',
    *   'my-database'
    * );
    * // 'projects/grape-spaceship-123/instances/my-instance/databases/my-database'
    * ```
    */
  /* static member */
  inline def formatName(instanceName: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(instanceName.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def getEnvironmentQueryOptions(): IQueryOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvironmentQueryOptions")().asInstanceOf[IQueryOptions]
}
