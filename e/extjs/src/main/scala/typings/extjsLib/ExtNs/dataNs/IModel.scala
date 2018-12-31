package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModel
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Property] (String) */
  var COMMIT: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var EDIT: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (String) */
  var REJECT: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object[]) */
  var associations: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Method] Begins an edit  */
  var beginEdit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String/Object/String[]/Object[]) */
  var belongsTo: js.UndefOr[js.Any] = js.undefined
  /** [Method] Cancels all changes made in the current edit operation  */
  var cancelEdit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var clientIdProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Usually called by the Ext data Store which owns the model instance
  		* @param silent Boolean Pass true to skip notification of the owning store of the change.
  		* @param modifiedFieldNames String[] Array of field names changed during sync with server if known. Omit or pass null if unknown. An empty array means that it is known that no fields were modified by the server's response. Defaults to false.
  		*/
  var commit: js.UndefOr[
    js.Function2[
      /* silent */ js.UndefOr[scala.Boolean], 
      /* modifiedFieldNames */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Creates a copy clone of this Model instance
  		* @param id String A new id, defaults to the id of the instance being copied. See id. To generate a phantom instance with a new id use: var rec = record.copy(); // clone the record Ext.data.Model.id(rec); // automatically generate a unique sequential id
  		* @returns Ext.data.Model
  		*/
  var copy: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], this.type]] = js.undefined
  /** [Config Option] (String) */
  var defaultProxyType: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Destroys the model using the configured proxy
  		* @param options Object Options to pass to the proxy. Config object for Ext.data.Operation.
  		* @returns Ext.data.Model The Model instance
  		*/
  var destroy: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Property] (Boolean) */
  var dirty: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var editing: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Ends an edit
  		* @param silent Boolean True to not notify the store of the change
  		* @param modifiedFieldNames String[] Array of field names changed during edit.
  		*/
  var endEdit: js.UndefOr[
    js.Function2[
      /* silent */ js.UndefOr[scala.Boolean], 
      /* modifiedFieldNames */ js.UndefOr[extjsLib.ExtNs.Array], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Object[]/String[]) */
  var fields: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of the given field
  		* @param fieldName String The field to fetch the value for
  		* @returns Object The value
  		*/
  var get: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Gets all of the data from this Models loaded associations
  		* @returns Object The nested data set for the Model's loaded associations
  		*/
  var getAssociatedData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets a hash of only the fields that have been modified since this Model was created or commited
  		* @returns Object
  		*/
  var getChanges: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Gets all values for each field in this model and returns an object containing the current data
  		* @param includeAssociated Boolean True to also include associated data. Defaults to false.
  		* @returns Object An object hash containing all the values in this model
  		*/
  var getData: js.UndefOr[js.Function1[/* includeAssociated */ js.UndefOr[scala.Boolean], _]] = js.undefined
  /** [Method] Returns the unique ID allocated to this model instance as defined by idProperty
  		* @returns Number/String The id
  		*/
  var getId: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the configured Proxy for this Model
  		* @returns Ext.data.proxy.Proxy The proxy
  		*/
  var getProxy: js.UndefOr[js.Function0[extjsLib.ExtNs.dataNs.proxyNs.IProxy]] = js.undefined
  /** [Config Option] (String/Object/String[]/Object[]) */
  var hasMany: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Object/Ext.data.Field) */
  var idProperty: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Object) */
  var idgen: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var isModel: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns true if the passed field name has been modified since the load or last commit
  		* @param fieldName String Ext.data.Field.name
  		* @returns Boolean
  		*/
  var isModified: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Method] Checks if the model is valid
  		* @returns Boolean True if the model is valid.
  		*/
  var isValid: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Tells this model instance that it has been added to a store
  		* @param store Ext.data.Store The store to which this model has been added.
  		*/
  var join: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], scala.Unit]] = js.undefined
  /** [Property] (Object) */
  var modified: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var persistenceProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Boolean) */
  var phantom: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String/Object/Ext.data.proxy.Proxy) */
  var proxy: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var raw: js.UndefOr[js.Any] = js.undefined
  /** [Method] Usually called by the Ext data Store to which this model instance has been joined
  		* @param silent Boolean True to skip notification of the owning store of the change. Defaults to false.
  		*/
  var reject: js.UndefOr[js.Function1[/* silent */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Saves the model instance using the configured proxy
  		* @param options Object Options to pass to the proxy. Config object for Ext.data.Operation.
  		* @returns Ext.data.Model The Model instance
  		*/
  var save: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the given field to the given value marks the instance as dirty
  		* @param fieldName String/Object The field to set, or an object containing key/value pairs
  		* @param newValue Object The value to set
  		* @returns String[] The array of modified field names or null if nothing was modified.
  		*/
  var set: js.UndefOr[
    js.Function2[
      /* fieldName */ js.UndefOr[js.Any], 
      /* newValue */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Marks this Record as dirty  */
  var setDirty: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets the model instance s id field to the given id
  		* @param id Number/String The new id
  		*/
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the Proxy to use for this model
  		* @param proxy String/Object/Ext.data.proxy.Proxy The proxy
  		* @returns Ext.data.proxy.Proxy
  		*/
  var setProxy: js.UndefOr[
    js.Function1[/* proxy */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.proxyNs.IProxy]
  ] = js.undefined
  /** [Property] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.undefined
  /** [Property] (Ext.data.Store[]) */
  var stores: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Method] Tells this model instance that it has been removed from the store
  		* @param store Ext.data.Store The store from which this model has been removed.
  		*/
  var unjoin: js.UndefOr[js.Function1[/* store */ js.UndefOr[IStore], scala.Unit]] = js.undefined
  /** [Method] Validates the current data against all of its configured validations
  		* @returns Ext.data.Errors The errors object
  		*/
  var validate: js.UndefOr[js.Function0[IErrors]] = js.undefined
  /** [Config Option] (Object[]) */
  var validations: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
}

