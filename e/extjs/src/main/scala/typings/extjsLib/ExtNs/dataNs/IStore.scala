package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStore extends IAbstractStore {
  /** [Method] Adds Model instance to the Store
  		* @param model Ext.data.Model[]/Ext.data.Model.../Object[]/Object... An array of Model instances or Model configuration objects, or variable number of Model instance or config arguments.
  		* @returns Ext.data.Model[] The model instances that were added
  		*/
  var add: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Adds a new Filter to this Store s filter set and by default applys the updated filter set to the Store s unfiltered
  		* @param filters Object[]/Ext.util.Filter[] The set of filters to add to the current filter set.
  		* @param applyFilters Boolean Pass as false to add the filter but not apply the updated filter set.
  		*/
  var addFilter: js.UndefOr[
    js.Function2[
      /* filters */ js.UndefOr[js.Any], 
      /* applyFilters */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Local sort only Inserts the passed Record into the Store at the index where it should go based on the current sort
  		* @param record Ext.data.Record
  		*/
  var addSorted: js.UndefOr[js.Function1[/* record */ js.UndefOr[IRecord], scala.Unit]] = js.undefined
  /** [Method] Runs the aggregate function for all the records in the store
  		* @param fn Function The function to execute. The function is called with a single parameter, an array of records for that group.
  		* @param scope Object The scope to execute the function in. Defaults to the store.
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the group average being the value. The grouped parameter is only honored if the store has a groupField.
  		* @param args Array Any arguments to append to the function call
  		* @returns Object An object literal with the group names and their appropriate values.
  		*/
  var aggregate: js.UndefOr[
    js.Function4[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* grouped */ js.UndefOr[scala.Boolean], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      _
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var autoDestroy: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Gets the average value in the store
  		* @param field String The field in each record
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the group average being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Object The average value, if no items exist, 0.
  		*/
  var average: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[scala.Boolean], _]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var buffered: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Reverts to a view of the Record cache with no filtering applied
  		* @param suppressEvent Boolean If true the filter is cleared silently. For a locally filtered Store, this means that the filter collection is cleared without firing the datachanged event. For a remotely filtered Store, this means that the filter collection is cleared, but the store is not reloaded from the server.
  		*/
  var clearFilter: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Clear any groupers in the store */
  var clearGrouping: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var clearOnPageLoad: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var clearRemovedOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Collects unique values for a particular dataIndex from this store
  		* @param dataIndex String The property to collect
  		* @param allowNull Boolean Pass true to allow null, undefined or empty string values
  		* @param bypassFilter Boolean Pass true to collect from all records, even ones which are filtered.
  		* @returns Object[] An array of the unique values
  		*/
  var collect: js.UndefOr[
    js.Function3[
      /* dataIndex */ js.UndefOr[java.lang.String], 
      /* allowNull */ js.UndefOr[scala.Boolean], 
      /* bypassFilter */ js.UndefOr[scala.Boolean], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Commits all Records with outstanding changes  */
  var commitChanges: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Gets the count of items in the store
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the count for each group being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Number the count
  		*/
  var count: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[scala.Boolean], scala.Double]] = js.undefined
  /** [Property] (Number) */
  var currentPage: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Object[]/Ext.data.Model[]) */
  var data: js.UndefOr[js.Any] = js.undefined
  /** [Method] Calls the specified function for each record in the store
  		* @param fn Function The function to call. The Record is passed as the first parameter. Returning false aborts and exits the iteration.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current record in the iteration.
  		*/
  var each: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Filters the loaded set of records by a given set of filters
  		* @param filters Object[]/Ext.util.Filter[]/String The set of filters to apply to the data. These are stored internally on the store, but the filtering itself is done on the Store's MixedCollection. See MixedCollection's filter method for filter syntax. Alternatively, pass in a property string. If no parameters are passed, the Store's existing filter set is applied.
  		* @param value String value to filter by (only if using a property string as the first argument)
  		*/
  var filter: js.UndefOr[
    js.Function2[
      /* filters */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Filters by a function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
  		*/
  var filterBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Finds the index of the first matching Record in this store by a specific field value
  		* @param fieldName String The name of the Record field to test.
  		* @param value String/RegExp Either a string that the field value should begin with, or a RegExp to test against the field.
  		* @param startIndex Number The index to start searching at
  		* @param anyMatch Boolean True to match any part of the string, not just the beginning
  		* @param caseSensitive Boolean True for case sensitive comparison
  		* @param exactMatch Boolean True to force exact match (^ and $ characters added to the regex).
  		* @returns Number The matched index or -1
  		*/
  var find: js.UndefOr[
    js.Function6[
      /* fieldName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      /* exactMatch */ js.UndefOr[scala.Boolean], 
      scala.Double
    ]
  ] = js.undefined
  /** [Method] Find the index of the first matching Record in this Store by a function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
  		* @param startIndex Number The index to start searching at
  		* @returns Number The matched index or -1
  		*/
  var findBy: js.UndefOr[
    js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      scala.Double
    ]
  ] = js.undefined
  /** [Method] Finds the index of the first matching Record in this store by a specific field value
  		* @param fieldName String The name of the Record field to test.
  		* @param value Object The value to match the field against.
  		* @param startIndex Number The index to start searching at
  		* @returns Number The matched index or -1
  		*/
  var findExact: js.UndefOr[
    js.Function3[
      /* fieldName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      scala.Double
    ]
  ] = js.undefined
  /** [Method] Finds the first matching Record in this store by a specific field value
  		* @param fieldName String The name of the Record field to test.
  		* @param value String/RegExp Either a string that the field value should begin with, or a RegExp to test against the field.
  		* @param startIndex Number The index to start searching at
  		* @param anyMatch Boolean True to match any part of the string, not just the beginning
  		* @param caseSensitive Boolean True for case sensitive comparison
  		* @param exactMatch Boolean True to force exact match (^ and $ characters added to the regex).
  		* @returns Ext.data.Model The matched record or null
  		*/
  var findRecord: js.UndefOr[
    js.Function6[
      /* fieldName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      /* exactMatch */ js.UndefOr[scala.Boolean], 
      IModel
    ]
  ] = js.undefined
  /** [Method] Convenience function for getting the first model instance in the store
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the first record being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Ext.data.Model/undefined The first model instance in the store, or undefined
  		*/
  var first: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[scala.Boolean], _]] = js.undefined
  /** [Method] Get the Record at the specified index
  		* @param index Number The index of the Record to find.
  		* @returns Ext.data.Model The Record at the passed index. Returns undefined if not found.
  		*/
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], IModel]] = js.undefined
  /** [Method] Get the Record with the specified id
  		* @param id Mixed The id of the Record to find.
  		* @returns Ext.data.Model The Record with the passed id. Returns null if not found.
  		*/
  var getById: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], IModel]] = js.undefined
  /** [Method] Gets the number of records in store
  		* @returns Number The number of Records in the Store.
  		*/
  var getCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the string to group on for a given model instance
  		* @param instance Ext.data.Model The model instance
  		* @returns String The string to compare when forming groups
  		*/
  var getGroupString: js.UndefOr[js.Function1[/* instance */ js.UndefOr[IModel], java.lang.String]] = js.undefined
  /** [Method] Returns an array containing the result of applying grouping to the records in this store
  		* @param groupName String Pass in an optional groupName argument to access a specific group as defined by getGroupString.
  		* @returns Object/Object[] The grouped data
  		*/
  var getGroups: js.UndefOr[js.Function1[/* groupName */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Determines the page from a record index
  		* @param index Number The record index
  		* @returns Number The page the record belongs to
  		*/
  var getPageFromRecordIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], scala.Double]] = js.undefined
  /** [Method] Gathers a range of Records between specified indices
  		* @param start Number The starting index. Defaults to zero for non buffered Stores.
  		* @param end Number The ending index. Defaults to the last Record for non buffered Stores.
  		* @param options Object Used when the Store is {@link buffered] and the range may not be available synchronously.
  		* @returns Ext.data.Model[] An array of records if the records are immediately available. For buffered stores, you should pass the callback option unless you know that the range will be present - see rangeCached.
  		*/
  var getRange: js.UndefOr[
    js.Function3[
      /* start */ js.UndefOr[scala.Double], 
      /* end */ js.UndefOr[scala.Double], 
      /* options */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Returns the total number of Model instances that the Proxy indicates exist
  		* @returns Number The total number of Model instances available via the Proxy. 0 returned if no value has been set via the reader.
  		*/
  var getTotalCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Groups data inside the store
  		* @param groupers String/Object[] Either a string name of one of the fields in this Store's configured Model, or an Array of grouper configurations.
  		* @param direction String The overall direction to group the data by.
  		*/
  var group: js.UndefOr[
    js.Function2[
      /* groupers */ js.UndefOr[js.Any], 
      /* direction */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var groupDir: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var groupField: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.util.MixedCollection) */
  var groupers: js.UndefOr[extjsLib.ExtNs.utilNs.IMixedCollection] = js.undefined
  /** [Method] Guarantee a specific range this will load the store with a range that must be the pageSize or smaller and take car
  		* @param start Object
  		* @param end Object
  		* @param callback Object
  		* @param scope Object
  		* @param options Object
  		*/
  var guaranteeRange: js.UndefOr[
    js.Function5[
      /* start */ js.UndefOr[js.Any], 
      /* end */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Get the index of the record within the store
  		* @param record Ext.data.Model The Ext.data.Model object to find.
  		* @returns Number The index of the passed Record. Returns -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], scala.Double]] = js.undefined
  /** [Method] Get the index within the store of the Record with the passed id
  		* @param id String The id of the Record to find.
  		* @returns Number The index of the Record. Returns -1 if not found.
  		*/
  var indexOfId: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Double]] = js.undefined
  /** [Method] Get the index within the entire dataset
  		* @param record Ext.data.Model The Ext.data.Model object to find.
  		* @returns Number The index of the passed Record. Returns -1 if not found.
  		*/
  var indexOfTotal: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], scala.Double]] = js.undefined
  /** [Method] Inserts Model instances into the Store at the given index and fires the add event
  		* @param index Number The start index at which to insert the passed Records.
  		* @param records Ext.data.Model[] An Array of Ext.data.Model objects to add to the store.
  		* @returns Ext.data.Model[] records The added records
  		*/
  var insert: js.UndefOr[
    js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* records */ js.UndefOr[extjsLib.ExtNs.Array], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Returns true if this store is currently filtered
  		* @returns Boolean
  		*/
  var isFiltered: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Checks if the store is currently grouped
  		* @returns Boolean true if the store is grouped.
  		*/
  var isGrouped: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Convenience function for getting the last model instance in the store
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the last record being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Ext.data.Model/undefined The last model instance in the store, or undefined
  		*/
  var last: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[scala.Boolean], _]] = js.undefined
  /** [Config Option] (Number) */
  var leadingBufferZone: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Loads an array of data straight into the Store
  		* @param data Ext.data.Model[]/Object[] Array of data to load. Any non-model instances will be cast into model instances first.
  		* @param append Boolean true to add the records to the existing records in the store, false to remove the old ones first.
  		*/
  var loadData: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  /** [Method] Loads a given page of data by setting the start and limit values appropriately
  		* @param page Number The number of the page to load.
  		* @param options Object See options for load.
  		*/
  var loadPage: js.UndefOr[
    js.Function2[/* page */ js.UndefOr[scala.Double], /* options */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Loads data via the bound Proxy s reader Use this method if you are attempting to load data and want to utilize the c
  		* @param data Object[] The full JSON object you'd like to load into the Data store.
  		* @param append Boolean true to add the records to the existing records in the store, false to remove the old ones first.
  		*/
  var loadRawData: js.UndefOr[
    js.Function2[
      /* data */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* append */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Loads an array of model instances into the store fires the datachanged event
  		* @param records Ext.data.Model[] The array of records to load
  		* @param options Object
  		*/
  var loadRecords: js.UndefOr[
    js.Function2[
      /* records */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Gets the maximum value in the store
  		* @param field String The field in each record
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the maximum in the group being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Object The maximum value, if no items exist, undefined.
  		*/
  var max: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[scala.Boolean], _]
  ] = js.undefined
  /** [Method] Gets the minimum value in the store
  		* @param field String The field in each record
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the minimum in the group being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Object The minimum value, if no items exist, undefined.
  		*/
  var min: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[scala.Boolean], _]
  ] = js.undefined
  /** [Method] Loads the next page in the current data set
  		* @param options Object See options for load
  		*/
  var nextPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Prefetches data into the store using its configured proxy
  		* @param options Object config object, passed into the Ext.data.Operation object before loading. See load
  		*/
  var prefetch: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Prefetches a page of data
  		* @param page Number The page to prefetch
  		* @param options Object config object, passed into the Ext.data.Operation object before loading. See load
  		*/
  var prefetchPage: js.UndefOr[
    js.Function2[/* page */ js.UndefOr[scala.Double], /* options */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Ensures that the specified range of rows is present in the cache
  		* @param start Object
  		* @param end Object
  		*/
  var prefetchRange: js.UndefOr[
    js.Function2[/* start */ js.UndefOr[js.Any], /* end */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Loads the previous page in the current data set
  		* @param options Object See options for load
  		*/
  var previousPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var purgePageCount: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Query all the cached records in this Store by name value pair
  		* @param property String The property to create the filter function for
  		* @param value String/RegExp The string/regex to compare the property value to
  		* @param anyMatch Boolean true if we don't care if the filter value is not the full value.
  		* @param caseSensitive Boolean true to create a case-sensitive regex.
  		* @param exactMatch Boolean true to force exact match (^ and $ characters added to the regex). Ignored if anyMatch is true.
  		* @returns Ext.util.MixedCollection Returns an Ext.util.MixedCollection of the matched records
  		*/
  var query: js.UndefOr[
    js.Function5[
      /* property */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      /* exactMatch */ js.UndefOr[scala.Boolean], 
      extjsLib.ExtNs.utilNs.IMixedCollection
    ]
  ] = js.undefined
  /** [Method] Query all the cached records in this Store using a filtering function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed Defaults to this Store.
  		* @returns Ext.util.MixedCollection Returns an Ext.util.MixedCollection of the matched records
  		*/
  var queryBy: js.UndefOr[
    js.Function2[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.utilNs.IMixedCollection
    ]
  ] = js.undefined
  /** [Method] Rejects outstanding changes on all modified records and re insert any records that were removed locally  */
  var rejectChanges: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var remoteGroup: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Removes the specified record s from the Store firing the remove event for each instance that is removed
  		* @param records Ext.data.Model/Ext.data.Model[]/Number/Number[] Model instance or array of instances to remove or an array of indices from which to remove records.
  		*/
  var remove: js.UndefOr[js.Function1[/* records */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Removes all items from the store
  		* @param silent Boolean Pass true to prevent the record bulkremove and clear events from being fired.
  		*/
  @JSName("removeAll")
  var removeAll_IStore: js.UndefOr[js.Function1[/* silent */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Removes the model instance s at the given index
  		* @param index Number The record index
  		* @param count Number The number of records to delete
  		*/
  var removeAt: js.UndefOr[
    js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* count */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Removes an individual Filter from the current filter set using the passed Filter Filter id and by default applys the
  		* @param toRemove Mixed The id of a Filter to remove from the filter set, or a Filter instance to remove.
  		* @param applyFilters Boolean Pass as false to remove the filter but not apply the updated filter set. If null is passed, all anonymous Filters (Filters with no id property) will be removed.
  		*/
  var removeFilter: js.UndefOr[
    js.Function2[
      /* toRemove */ js.UndefOr[js.Any], 
      /* applyFilters */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Property] (Ext.util.MixedCollection) */
  var snapshot: js.UndefOr[extjsLib.ExtNs.utilNs.IMixedCollection] = js.undefined
  /** [Config Option] (Boolean) */
  var sortOnFilter: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] because prefetchData is stored by index this invalidates all of the prefetchedData
  		* @returns Ext.util.Sorter[]
  		*/
  @JSName("sort")
  var sort_IStore: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Sums the value of field for each record in store and returns the result
  		* @param field String A field in each record
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the sum for that group being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Number The sum
  		*/
  var sum: js.UndefOr[
    js.Function2[
      /* field */ js.UndefOr[java.lang.String], 
      /* grouped */ js.UndefOr[scala.Boolean], 
      scala.Double
    ]
  ] = js.undefined
  /** [Config Option] (Number) */
  var trailingBufferZone: js.UndefOr[scala.Double] = js.undefined
}

object IStore {
  @scala.inline
  def apply(
    IAbstractStore: IAbstractStore = null,
    add: js.Function1[/* model */ js.UndefOr[js.Any], extjsLib.ExtNs.Array] = null,
    addFilter: js.Function2[
      /* filters */ js.UndefOr[js.Any], 
      /* applyFilters */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    addSorted: js.Function1[/* record */ js.UndefOr[IRecord], scala.Unit] = null,
    aggregate: js.Function4[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* grouped */ js.UndefOr[scala.Boolean], 
      /* args */ js.UndefOr[extjsLib.ExtNs.Array], 
      _
    ] = null,
    autoDestroy: js.UndefOr[scala.Boolean] = js.undefined,
    average: js.Function2[/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[scala.Boolean], _] = null,
    buffered: js.UndefOr[scala.Boolean] = js.undefined,
    clearFilter: js.Function1[/* suppressEvent */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    clearGrouping: js.Function0[scala.Unit] = null,
    clearOnPageLoad: js.UndefOr[scala.Boolean] = js.undefined,
    clearRemovedOnLoad: js.UndefOr[scala.Boolean] = js.undefined,
    collect: js.Function3[
      /* dataIndex */ js.UndefOr[java.lang.String], 
      /* allowNull */ js.UndefOr[scala.Boolean], 
      /* bypassFilter */ js.UndefOr[scala.Boolean], 
      extjsLib.ExtNs.Array
    ] = null,
    commitChanges: js.Function0[scala.Unit] = null,
    count: js.Function1[/* grouped */ js.UndefOr[scala.Boolean], scala.Double] = null,
    currentPage: scala.Int | scala.Double = null,
    data: js.Any = null,
    each: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    filter: js.Function2[
      /* filters */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    filterBy: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    find: js.Function6[
      /* fieldName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      /* exactMatch */ js.UndefOr[scala.Boolean], 
      scala.Double
    ] = null,
    findBy: js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      scala.Double
    ] = null,
    findExact: js.Function3[
      /* fieldName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      scala.Double
    ] = null,
    findRecord: js.Function6[
      /* fieldName */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[scala.Double], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      /* exactMatch */ js.UndefOr[scala.Boolean], 
      IModel
    ] = null,
    first: js.Function1[/* grouped */ js.UndefOr[scala.Boolean], _] = null,
    getAt: js.Function1[/* index */ js.UndefOr[scala.Double], IModel] = null,
    getById: js.Function1[/* id */ js.UndefOr[js.Any], IModel] = null,
    getCount: js.Function0[scala.Double] = null,
    getGroupString: js.Function1[/* instance */ js.UndefOr[IModel], java.lang.String] = null,
    getGroups: js.Function1[/* groupName */ js.UndefOr[java.lang.String], _] = null,
    getNewRecords: js.Function0[extjsLib.ExtNs.Array] = null,
    getPageFromRecordIndex: js.Function1[/* index */ js.UndefOr[scala.Double], scala.Double] = null,
    getRange: js.Function3[
      /* start */ js.UndefOr[scala.Double], 
      /* end */ js.UndefOr[scala.Double], 
      /* options */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.Array
    ] = null,
    getTotalCount: js.Function0[scala.Double] = null,
    getUpdatedRecords: js.Function0[extjsLib.ExtNs.Array] = null,
    group: js.Function2[
      /* groupers */ js.UndefOr[js.Any], 
      /* direction */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    groupDir: java.lang.String = null,
    groupField: java.lang.String = null,
    groupers: extjsLib.ExtNs.utilNs.IMixedCollection = null,
    guaranteeRange: js.Function5[
      /* start */ js.UndefOr[js.Any], 
      /* end */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    indexOf: js.Function1[/* record */ js.UndefOr[IModel], scala.Double] = null,
    indexOfId: js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Double] = null,
    indexOfTotal: js.Function1[/* record */ js.UndefOr[IModel], scala.Double] = null,
    insert: js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* records */ js.UndefOr[extjsLib.ExtNs.Array], 
      extjsLib.ExtNs.Array
    ] = null,
    isFiltered: js.Function0[scala.Boolean] = null,
    isGrouped: js.Function0[scala.Boolean] = null,
    last: js.Function1[/* grouped */ js.UndefOr[scala.Boolean], _] = null,
    leadingBufferZone: scala.Int | scala.Double = null,
    load: js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit] = null,
    loadData: js.Function2[/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    loadPage: js.Function2[/* page */ js.UndefOr[scala.Double], /* options */ js.UndefOr[js.Any], scala.Unit] = null,
    loadRawData: js.Function2[
      /* data */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* append */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    loadRecords: js.Function2[
      /* records */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    max: js.Function2[/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[scala.Boolean], _] = null,
    min: js.Function2[/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[scala.Boolean], _] = null,
    nextPage: js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit] = null,
    pageSize: scala.Int | scala.Double = null,
    prefetch: js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit] = null,
    prefetchPage: js.Function2[/* page */ js.UndefOr[scala.Double], /* options */ js.UndefOr[js.Any], scala.Unit] = null,
    prefetchRange: js.Function2[/* start */ js.UndefOr[js.Any], /* end */ js.UndefOr[js.Any], scala.Unit] = null,
    previousPage: js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit] = null,
    proxy: js.Any = null,
    purgePageCount: scala.Int | scala.Double = null,
    query: js.Function5[
      /* property */ js.UndefOr[java.lang.String], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[scala.Boolean], 
      /* caseSensitive */ js.UndefOr[scala.Boolean], 
      /* exactMatch */ js.UndefOr[scala.Boolean], 
      extjsLib.ExtNs.utilNs.IMixedCollection
    ] = null,
    queryBy: js.Function2[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.utilNs.IMixedCollection
    ] = null,
    rejectChanges: js.Function0[scala.Unit] = null,
    reload: js.Function1[/* options */ js.UndefOr[js.Any], scala.Unit] = null,
    remoteFilter: js.UndefOr[scala.Boolean] = js.undefined,
    remoteGroup: js.UndefOr[scala.Boolean] = js.undefined,
    remoteSort: js.UndefOr[scala.Boolean] = js.undefined,
    remove: js.Function1[/* records */ js.UndefOr[js.Any], scala.Unit] = null,
    removeAll: js.Function1[/* silent */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    removeAt: js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* count */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    removeFilter: js.Function2[
      /* toRemove */ js.UndefOr[js.Any], 
      /* applyFilters */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ] = null,
    snapshot: extjsLib.ExtNs.utilNs.IMixedCollection = null,
    sort: js.Function0[extjsLib.ExtNs.Array] = null,
    sortOnFilter: js.UndefOr[scala.Boolean] = js.undefined,
    sum: js.Function2[
      /* field */ js.UndefOr[java.lang.String], 
      /* grouped */ js.UndefOr[scala.Boolean], 
      scala.Double
    ] = null,
    trailingBufferZone: scala.Int | scala.Double = null
  ): IStore = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IAbstractStore)
    if (add != null) __obj.updateDynamic("add")(add)
    if (addFilter != null) __obj.updateDynamic("addFilter")(addFilter)
    if (addSorted != null) __obj.updateDynamic("addSorted")(addSorted)
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate)
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy)
    if (average != null) __obj.updateDynamic("average")(average)
    if (!js.isUndefined(buffered)) __obj.updateDynamic("buffered")(buffered)
    if (clearFilter != null) __obj.updateDynamic("clearFilter")(clearFilter)
    if (clearGrouping != null) __obj.updateDynamic("clearGrouping")(clearGrouping)
    if (!js.isUndefined(clearOnPageLoad)) __obj.updateDynamic("clearOnPageLoad")(clearOnPageLoad)
    if (!js.isUndefined(clearRemovedOnLoad)) __obj.updateDynamic("clearRemovedOnLoad")(clearRemovedOnLoad)
    if (collect != null) __obj.updateDynamic("collect")(collect)
    if (commitChanges != null) __obj.updateDynamic("commitChanges")(commitChanges)
    if (count != null) __obj.updateDynamic("count")(count)
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (each != null) __obj.updateDynamic("each")(each)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy)
    if (find != null) __obj.updateDynamic("find")(find)
    if (findBy != null) __obj.updateDynamic("findBy")(findBy)
    if (findExact != null) __obj.updateDynamic("findExact")(findExact)
    if (findRecord != null) __obj.updateDynamic("findRecord")(findRecord)
    if (first != null) __obj.updateDynamic("first")(first)
    if (getAt != null) __obj.updateDynamic("getAt")(getAt)
    if (getById != null) __obj.updateDynamic("getById")(getById)
    if (getCount != null) __obj.updateDynamic("getCount")(getCount)
    if (getGroupString != null) __obj.updateDynamic("getGroupString")(getGroupString)
    if (getGroups != null) __obj.updateDynamic("getGroups")(getGroups)
    if (getNewRecords != null) __obj.updateDynamic("getNewRecords")(getNewRecords)
    if (getPageFromRecordIndex != null) __obj.updateDynamic("getPageFromRecordIndex")(getPageFromRecordIndex)
    if (getRange != null) __obj.updateDynamic("getRange")(getRange)
    if (getTotalCount != null) __obj.updateDynamic("getTotalCount")(getTotalCount)
    if (getUpdatedRecords != null) __obj.updateDynamic("getUpdatedRecords")(getUpdatedRecords)
    if (group != null) __obj.updateDynamic("group")(group)
    if (groupDir != null) __obj.updateDynamic("groupDir")(groupDir)
    if (groupField != null) __obj.updateDynamic("groupField")(groupField)
    if (groupers != null) __obj.updateDynamic("groupers")(groupers)
    if (guaranteeRange != null) __obj.updateDynamic("guaranteeRange")(guaranteeRange)
    if (indexOf != null) __obj.updateDynamic("indexOf")(indexOf)
    if (indexOfId != null) __obj.updateDynamic("indexOfId")(indexOfId)
    if (indexOfTotal != null) __obj.updateDynamic("indexOfTotal")(indexOfTotal)
    if (insert != null) __obj.updateDynamic("insert")(insert)
    if (isFiltered != null) __obj.updateDynamic("isFiltered")(isFiltered)
    if (isGrouped != null) __obj.updateDynamic("isGrouped")(isGrouped)
    if (last != null) __obj.updateDynamic("last")(last)
    if (leadingBufferZone != null) __obj.updateDynamic("leadingBufferZone")(leadingBufferZone.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load)
    if (loadData != null) __obj.updateDynamic("loadData")(loadData)
    if (loadPage != null) __obj.updateDynamic("loadPage")(loadPage)
    if (loadRawData != null) __obj.updateDynamic("loadRawData")(loadRawData)
    if (loadRecords != null) __obj.updateDynamic("loadRecords")(loadRecords)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (nextPage != null) __obj.updateDynamic("nextPage")(nextPage)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (prefetch != null) __obj.updateDynamic("prefetch")(prefetch)
    if (prefetchPage != null) __obj.updateDynamic("prefetchPage")(prefetchPage)
    if (prefetchRange != null) __obj.updateDynamic("prefetchRange")(prefetchRange)
    if (previousPage != null) __obj.updateDynamic("previousPage")(previousPage)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (purgePageCount != null) __obj.updateDynamic("purgePageCount")(purgePageCount.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (queryBy != null) __obj.updateDynamic("queryBy")(queryBy)
    if (rejectChanges != null) __obj.updateDynamic("rejectChanges")(rejectChanges)
    if (reload != null) __obj.updateDynamic("reload")(reload)
    if (!js.isUndefined(remoteFilter)) __obj.updateDynamic("remoteFilter")(remoteFilter)
    if (!js.isUndefined(remoteGroup)) __obj.updateDynamic("remoteGroup")(remoteGroup)
    if (!js.isUndefined(remoteSort)) __obj.updateDynamic("remoteSort")(remoteSort)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (removeAll != null) __obj.updateDynamic("removeAll")(removeAll)
    if (removeAt != null) __obj.updateDynamic("removeAt")(removeAt)
    if (removeFilter != null) __obj.updateDynamic("removeFilter")(removeFilter)
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (!js.isUndefined(sortOnFilter)) __obj.updateDynamic("sortOnFilter")(sortOnFilter)
    if (sum != null) __obj.updateDynamic("sum")(sum)
    if (trailingBufferZone != null) __obj.updateDynamic("trailingBufferZone")(trailingBufferZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStore]
  }
}

