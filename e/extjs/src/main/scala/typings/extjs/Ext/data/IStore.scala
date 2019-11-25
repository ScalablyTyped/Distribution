package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.util.IMixedCollection
import typings.extjs.Ext.util.ISorter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStore extends IAbstractStore {
  /** [Method] Adds Model instance to the Store
  		* @param model Ext.data.Model[]/Ext.data.Model.../Object[]/Object... An array of Model instances or Model configuration objects, or variable number of Model instance or config arguments.
  		* @returns Ext.data.Model[] The model instances that were added
  		*/
  var add: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], Array]] = js.undefined
  /** [Method] Adds a new Filter to this Store s filter set and by default applys the updated filter set to the Store s unfiltered
  		* @param filters Object[]/Ext.util.Filter[] The set of filters to add to the current filter set.
  		* @param applyFilters Boolean Pass as false to add the filter but not apply the updated filter set.
  		*/
  var addFilter: js.UndefOr[
    js.Function2[/* filters */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Local sort only Inserts the passed Record into the Store at the index where it should go based on the current sort
  		* @param record Ext.data.Record
  		*/
  var addSorted: js.UndefOr[js.Function1[/* record */ js.UndefOr[IRecord], Unit]] = js.undefined
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
      /* grouped */ js.UndefOr[Boolean], 
      /* args */ js.UndefOr[Array], 
      _
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var autoDestroy: js.UndefOr[Boolean] = js.undefined
  /** [Method] Gets the average value in the store
  		* @param field String The field in each record
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the group average being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Object The average value, if no items exist, 0.
  		*/
  var average: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var buffered: js.UndefOr[Boolean] = js.undefined
  /** [Method] Reverts to a view of the Record cache with no filtering applied
  		* @param suppressEvent Boolean If true the filter is cleared silently. For a locally filtered Store, this means that the filter collection is cleared without firing the datachanged event. For a remotely filtered Store, this means that the filter collection is cleared, but the store is not reloaded from the server.
  		*/
  var clearFilter: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Clear any groupers in the store */
  var clearGrouping: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var clearOnPageLoad: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var clearRemovedOnLoad: js.UndefOr[Boolean] = js.undefined
  /** [Method] Collects unique values for a particular dataIndex from this store
  		* @param dataIndex String The property to collect
  		* @param allowNull Boolean Pass true to allow null, undefined or empty string values
  		* @param bypassFilter Boolean Pass true to collect from all records, even ones which are filtered.
  		* @returns Object[] An array of the unique values
  		*/
  var collect: js.UndefOr[
    js.Function3[
      /* dataIndex */ js.UndefOr[java.lang.String], 
      /* allowNull */ js.UndefOr[Boolean], 
      /* bypassFilter */ js.UndefOr[Boolean], 
      Array
    ]
  ] = js.undefined
  /** [Method] Commits all Records with outstanding changes  */
  var commitChanges: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Gets the count of items in the store
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the count for each group being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Number the count
  		*/
  var count: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[Boolean], Double]] = js.undefined
  /** [Property] (Number) */
  var currentPage: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Object[]/Ext.data.Model[]) */
  var data: js.UndefOr[js.Any] = js.undefined
  /** [Method] Calls the specified function for each record in the store
  		* @param fn Function The function to call. The Record is passed as the first parameter. Returning false aborts and exits the iteration.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the current record in the iteration.
  		*/
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Filters the loaded set of records by a given set of filters
  		* @param filters Object[]/Ext.util.Filter[]/String The set of filters to apply to the data. These are stored internally on the store, but the filtering itself is done on the Store's MixedCollection. See MixedCollection's filter method for filter syntax. Alternatively, pass in a property string. If no parameters are passed, the Store's existing filter set is applied.
  		* @param value String value to filter by (only if using a property string as the first argument)
  		*/
  var filter: js.UndefOr[
    js.Function2[/* filters */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String], Unit]
  ] = js.undefined
  /** [Method] Filters by a function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
  		*/
  var filterBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
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
      /* startIndex */ js.UndefOr[Double], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      /* exactMatch */ js.UndefOr[Boolean], 
      Double
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
      /* startIndex */ js.UndefOr[Double], 
      Double
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
      /* startIndex */ js.UndefOr[Double], 
      Double
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
      /* startIndex */ js.UndefOr[Double], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      /* exactMatch */ js.UndefOr[Boolean], 
      IModel
    ]
  ] = js.undefined
  /** [Method] Convenience function for getting the first model instance in the store
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the first record being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Ext.data.Model/undefined The first model instance in the store, or undefined
  		*/
  var first: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[Boolean], _]] = js.undefined
  /** [Method] Get the Record at the specified index
  		* @param index Number The index of the Record to find.
  		* @returns Ext.data.Model The Record at the passed index. Returns undefined if not found.
  		*/
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], IModel]] = js.undefined
  /** [Method] Get the Record with the specified id
  		* @param id Mixed The id of the Record to find.
  		* @returns Ext.data.Model The Record with the passed id. Returns null if not found.
  		*/
  var getById: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], IModel]] = js.undefined
  /** [Method] Gets the number of records in store
  		* @returns Number The number of Records in the Store.
  		*/
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
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
  var getPageFromRecordIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Double]] = js.undefined
  /** [Method] Gathers a range of Records between specified indices
  		* @param start Number The starting index. Defaults to zero for non buffered Stores.
  		* @param end Number The ending index. Defaults to the last Record for non buffered Stores.
  		* @param options Object Used when the Store is {@link buffered] and the range may not be available synchronously.
  		* @returns Ext.data.Model[] An array of records if the records are immediately available. For buffered stores, you should pass the callback option unless you know that the range will be present - see rangeCached.
  		*/
  var getRange: js.UndefOr[
    js.Function3[
      /* start */ js.UndefOr[Double], 
      /* end */ js.UndefOr[Double], 
      /* options */ js.UndefOr[js.Any], 
      Array
    ]
  ] = js.undefined
  /** [Method] Returns the total number of Model instances that the Proxy indicates exist
  		* @returns Number The total number of Model instances available via the Proxy. 0 returned if no value has been set via the reader.
  		*/
  var getTotalCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Groups data inside the store
  		* @param groupers String/Object[] Either a string name of one of the fields in this Store's configured Model, or an Array of grouper configurations.
  		* @param direction String The overall direction to group the data by.
  		*/
  var group: js.UndefOr[
    js.Function2[
      /* groupers */ js.UndefOr[js.Any], 
      /* direction */ js.UndefOr[java.lang.String], 
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var groupDir: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var groupField: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.util.MixedCollection) */
  var groupers: js.UndefOr[IMixedCollection] = js.undefined
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
      Unit
    ]
  ] = js.undefined
  /** [Method] Get the index of the record within the store
  		* @param record Ext.data.Model The Ext.data.Model object to find.
  		* @returns Number The index of the passed Record. Returns -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Double]] = js.undefined
  /** [Method] Get the index within the store of the Record with the passed id
  		* @param id String The id of the Record to find.
  		* @returns Number The index of the Record. Returns -1 if not found.
  		*/
  var indexOfId: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], Double]] = js.undefined
  /** [Method] Get the index within the entire dataset
  		* @param record Ext.data.Model The Ext.data.Model object to find.
  		* @returns Number The index of the passed Record. Returns -1 if not found.
  		*/
  var indexOfTotal: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Double]] = js.undefined
  /** [Method] Inserts Model instances into the Store at the given index and fires the add event
  		* @param index Number The start index at which to insert the passed Records.
  		* @param records Ext.data.Model[] An Array of Ext.data.Model objects to add to the store.
  		* @returns Ext.data.Model[] records The added records
  		*/
  var insert: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array], Array]
  ] = js.undefined
  /** [Method] Returns true if this store is currently filtered
  		* @returns Boolean
  		*/
  var isFiltered: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Checks if the store is currently grouped
  		* @returns Boolean true if the store is grouped.
  		*/
  var isGrouped: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Convenience function for getting the last model instance in the store
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the last record being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Ext.data.Model/undefined The last model instance in the store, or undefined
  		*/
  var last: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[Boolean], _]] = js.undefined
  /** [Config Option] (Number) */
  var leadingBufferZone: js.UndefOr[Double] = js.undefined
  /** [Method] Loads an array of data straight into the Store
  		* @param data Ext.data.Model[]/Object[] Array of data to load. Any non-model instances will be cast into model instances first.
  		* @param append Boolean true to add the records to the existing records in the store, false to remove the old ones first.
  		*/
  var loadData: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Loads a given page of data by setting the start and limit values appropriately
  		* @param page Number The number of the page to load.
  		* @param options Object See options for load.
  		*/
  var loadPage: js.UndefOr[
    js.Function2[/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Loads data via the bound Proxy s reader Use this method if you are attempting to load data and want to utilize the c
  		* @param data Object[] The full JSON object you'd like to load into the Data store.
  		* @param append Boolean true to add the records to the existing records in the store, false to remove the old ones first.
  		*/
  var loadRawData: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[Array], /* append */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Loads an array of model instances into the store fires the datachanged event
  		* @param records Ext.data.Model[] The array of records to load
  		* @param options Object
  		*/
  var loadRecords: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[Array], /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Gets the maximum value in the store
  		* @param field String The field in each record
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the maximum in the group being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Object The maximum value, if no items exist, undefined.
  		*/
  var max: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Gets the minimum value in the store
  		* @param field String The field in each record
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the minimum in the group being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Object The minimum value, if no items exist, undefined.
  		*/
  var min: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[Boolean], _]
  ] = js.undefined
  /** [Method] Loads the next page in the current data set
  		* @param options Object See options for load
  		*/
  var nextPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** [Method] Prefetches data into the store using its configured proxy
  		* @param options Object config object, passed into the Ext.data.Operation object before loading. See load
  		*/
  var prefetch: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Prefetches a page of data
  		* @param page Number The page to prefetch
  		* @param options Object config object, passed into the Ext.data.Operation object before loading. See load
  		*/
  var prefetchPage: js.UndefOr[
    js.Function2[/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Ensures that the specified range of rows is present in the cache
  		* @param start Object
  		* @param end Object
  		*/
  var prefetchRange: js.UndefOr[js.Function2[/* start */ js.UndefOr[js.Any], /* end */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Loads the previous page in the current data set
  		* @param options Object See options for load
  		*/
  var previousPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var purgePageCount: js.UndefOr[Double] = js.undefined
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
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      /* exactMatch */ js.UndefOr[Boolean], 
      IMixedCollection
    ]
  ] = js.undefined
  /** [Method] Query all the cached records in this Store using a filtering function
  		* @param fn Function The function to be called. It will be passed the following parameters:
  		* @param scope Object The scope (this reference) in which the function is executed Defaults to this Store.
  		* @returns Ext.util.MixedCollection Returns an Ext.util.MixedCollection of the matched records
  		*/
  var queryBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection]
  ] = js.undefined
  /** [Method] Rejects outstanding changes on all modified records and re insert any records that were removed locally  */
  var rejectChanges: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var remoteGroup: js.UndefOr[Boolean] = js.undefined
  /** [Method] Removes the specified record s from the Store firing the remove event for each instance that is removed
  		* @param records Ext.data.Model/Ext.data.Model[]/Number/Number[] Model instance or array of instances to remove or an array of indices from which to remove records.
  		*/
  var remove: js.UndefOr[js.Function1[/* records */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Removes all items from the store
  		* @param silent Boolean Pass true to prevent the record bulkremove and clear events from being fired.
  		*/
  @JSName("removeAll")
  var removeAll_IStore: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Removes the model instance s at the given index
  		* @param index Number The record index
  		* @param count Number The number of records to delete
  		*/
  var removeAt: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* count */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /** [Method] Removes an individual Filter from the current filter set using the passed Filter Filter id and by default applys the
  		* @param toRemove Mixed The id of a Filter to remove from the filter set, or a Filter instance to remove.
  		* @param applyFilters Boolean Pass as false to remove the filter but not apply the updated filter set. If null is passed, all anonymous Filters (Filters with no id property) will be removed.
  		*/
  var removeFilter: js.UndefOr[
    js.Function2[/* toRemove */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Property] (Ext.util.MixedCollection) */
  var snapshot: js.UndefOr[IMixedCollection] = js.undefined
  /** [Config Option] (Boolean) */
  var sortOnFilter: js.UndefOr[Boolean] = js.undefined
  /** [Method] because prefetchData is stored by index this invalidates all of the prefetchedData
  		* @returns Ext.util.Sorter[]
  		*/
  @JSName("sort")
  var sort_IStore: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Sums the value of field for each record in store and returns the result
  		* @param field String A field in each record
  		* @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the sum for that group being the value. The grouped parameter is only honored if the store has a groupField.
  		* @returns Number The sum
  		*/
  var sum: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[Boolean], Double]
  ] = js.undefined
  /** [Config Option] (Number) */
  var trailingBufferZone: js.UndefOr[Double] = js.undefined
}

object IStore {
  @scala.inline
  def apply(
    add: /* model */ js.UndefOr[js.Any] => Array = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addFilter: (/* filters */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[Boolean]) => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addSorted: /* record */ js.UndefOr[IRecord] => Unit = null,
    aggregate: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* grouped */ js.UndefOr[Boolean], /* args */ js.UndefOr[Array]) => _ = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    autoLoad: js.Any = null,
    autoSync: js.UndefOr[Boolean] = js.undefined,
    average: (/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[Boolean]) => _ = null,
    batchUpdateMode: java.lang.String = null,
    buffered: js.UndefOr[Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearFilter: /* suppressEvent */ js.UndefOr[Boolean] => Unit = null,
    clearGrouping: () => Unit = null,
    clearListeners: () => Unit = null,
    clearManagedListeners: () => Unit = null,
    clearOnPageLoad: js.UndefOr[Boolean] = js.undefined,
    clearRemovedOnLoad: js.UndefOr[Boolean] = js.undefined,
    collect: (/* dataIndex */ js.UndefOr[java.lang.String], /* allowNull */ js.UndefOr[Boolean], /* bypassFilter */ js.UndefOr[Boolean]) => Array = null,
    commitChanges: () => Unit = null,
    config: js.Any = null,
    count: /* grouped */ js.UndefOr[Boolean] => Double = null,
    currentPage: Int | Double = null,
    data: js.Any = null,
    defaultProxyType: java.lang.String = null,
    defaultSortDirection: java.lang.String = null,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    extend: java.lang.String = null,
    fields: Array = null,
    filter: (/* filters */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => Unit = null,
    filterBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    filterOnLoad: js.UndefOr[Boolean] = js.undefined,
    filters: js.Any = null,
    find: (/* fieldName */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => Double = null,
    findBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => Double = null,
    findExact: (/* fieldName */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => Double = null,
    findRecord: (/* fieldName */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => IModel = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array]) => Boolean = null,
    first: /* grouped */ js.UndefOr[Boolean] => _ = null,
    generateComparator: () => Unit = null,
    getAt: /* index */ js.UndefOr[Double] => IModel = null,
    getById: /* id */ js.UndefOr[js.Any] => IModel = null,
    getCount: () => Double = null,
    getFirstSorter: () => ISorter = null,
    getGroupString: /* instance */ js.UndefOr[IModel] => java.lang.String = null,
    getGroups: /* groupName */ js.UndefOr[java.lang.String] => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getModifiedRecords: () => Array = null,
    getNewRecords: () => Array = null,
    getPageFromRecordIndex: /* index */ js.UndefOr[Double] => Double = null,
    getProxy: () => typings.extjs.Ext.data.proxy.IProxy = null,
    getRange: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Array = null,
    getRemovedRecords: () => Array = null,
    getTotalCount: () => Double = null,
    getUpdatedRecords: () => Array = null,
    group: (/* groupers */ js.UndefOr[js.Any], /* direction */ js.UndefOr[java.lang.String]) => Unit = null,
    groupDir: java.lang.String = null,
    groupField: java.lang.String = null,
    groupers: IMixedCollection = null,
    guaranteeRange: (/* start */ js.UndefOr[js.Any], /* end */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    hasListeners: js.Any = null,
    indexOf: /* record */ js.UndefOr[IModel] => Double = null,
    indexOfId: /* id */ js.UndefOr[java.lang.String] => Double = null,
    indexOfTotal: /* record */ js.UndefOr[IModel] => Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IStore = null,
    initSortable: () => Unit = null,
    insert: (/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array]) => Array = null,
    isDestroyed: js.UndefOr[Boolean] = js.undefined,
    isFiltered: () => Boolean = null,
    isGrouped: () => Boolean = null,
    isLoading: () => Boolean = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isSortable: js.UndefOr[Boolean] = js.undefined,
    isStore: js.UndefOr[Boolean] = js.undefined,
    last: /* grouped */ js.UndefOr[Boolean] => _ = null,
    leadingBufferZone: Int | Double = null,
    listeners: js.Any = null,
    load: /* options */ js.UndefOr[js.Any] => Unit = null,
    loadData: (/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[Boolean]) => Unit = null,
    loadPage: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Unit = null,
    loadRawData: (/* data */ js.UndefOr[Array], /* append */ js.UndefOr[Boolean]) => Unit = null,
    loadRecords: (/* records */ js.UndefOr[Array], /* options */ js.UndefOr[js.Any]) => Unit = null,
    max: (/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[Boolean]) => _ = null,
    min: (/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[Boolean]) => _ = null,
    mixins: js.Any = null,
    model: java.lang.String = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    nextPage: /* options */ js.UndefOr[js.Any] => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    pageSize: Int | Double = null,
    prefetch: /* options */ js.UndefOr[js.Any] => Unit = null,
    prefetchPage: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Unit = null,
    prefetchRange: (/* start */ js.UndefOr[js.Any], /* end */ js.UndefOr[js.Any]) => Unit = null,
    previousPage: /* options */ js.UndefOr[js.Any] => Unit = null,
    proxy: js.Any = null,
    purgePageCount: Int | Double = null,
    query: (/* property */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => IMixedCollection = null,
    queryBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMixedCollection = null,
    rejectChanges: () => Unit = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[java.lang.String]) => _ = null,
    reload: /* options */ js.UndefOr[js.Any] => Unit = null,
    remoteFilter: js.UndefOr[Boolean] = js.undefined,
    remoteGroup: js.UndefOr[Boolean] = js.undefined,
    remoteSort: js.UndefOr[Boolean] = js.undefined,
    remove: /* records */ js.UndefOr[js.Any] => Unit = null,
    removeAll: /* silent */ js.UndefOr[Boolean] => Unit = null,
    removeAt: (/* index */ js.UndefOr[Double], /* count */ js.UndefOr[Double]) => Unit = null,
    removeFilter: (/* toRemove */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[Boolean]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removed: Array = null,
    requires: Array = null,
    resumeAutoSync: () => Unit = null,
    resumeEvent: /* repeated */ js.Any => Unit = null,
    resumeEvents: () => Unit = null,
    save: () => Unit = null,
    self: IClass = null,
    setProxy: /* proxy */ js.UndefOr[js.Any] => typings.extjs.Ext.data.proxy.IProxy = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    snapshot: IMixedCollection = null,
    sort: () => Array = null,
    sortOnFilter: js.UndefOr[Boolean] = js.undefined,
    sortOnLoad: js.UndefOr[Boolean] = js.undefined,
    sortRoot: java.lang.String = null,
    sorters: js.Any = null,
    statefulFilters: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    storeId: java.lang.String = null,
    sum: (/* field */ js.UndefOr[java.lang.String], /* grouped */ js.UndefOr[Boolean]) => Double = null,
    suspendAutoSync: () => Unit = null,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Unit = null,
    sync: /* options */ js.UndefOr[js.Any] => IStore = null,
    trailingBufferZone: Int | Double = null,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null
  ): IStore = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1(add))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addFilter != null) __obj.updateDynamic("addFilter")(js.Any.fromFunction2(addFilter))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (addSorted != null) __obj.updateDynamic("addSorted")(js.Any.fromFunction1(addSorted))
    if (aggregate != null) __obj.updateDynamic("aggregate")(js.Any.fromFunction4(aggregate))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy.asInstanceOf[js.Any])
    if (autoLoad != null) __obj.updateDynamic("autoLoad")(autoLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync.asInstanceOf[js.Any])
    if (average != null) __obj.updateDynamic("average")(js.Any.fromFunction2(average))
    if (batchUpdateMode != null) __obj.updateDynamic("batchUpdateMode")(batchUpdateMode.asInstanceOf[js.Any])
    if (!js.isUndefined(buffered)) __obj.updateDynamic("buffered")(buffered.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearFilter != null) __obj.updateDynamic("clearFilter")(js.Any.fromFunction1(clearFilter))
    if (clearGrouping != null) __obj.updateDynamic("clearGrouping")(js.Any.fromFunction0(clearGrouping))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (!js.isUndefined(clearOnPageLoad)) __obj.updateDynamic("clearOnPageLoad")(clearOnPageLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(clearRemovedOnLoad)) __obj.updateDynamic("clearRemovedOnLoad")(clearRemovedOnLoad.asInstanceOf[js.Any])
    if (collect != null) __obj.updateDynamic("collect")(js.Any.fromFunction3(collect))
    if (commitChanges != null) __obj.updateDynamic("commitChanges")(js.Any.fromFunction0(commitChanges))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(js.Any.fromFunction1(count))
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (defaultProxyType != null) __obj.updateDynamic("defaultProxyType")(defaultProxyType.asInstanceOf[js.Any])
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection.asInstanceOf[js.Any])
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2(each))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (filterBy != null) __obj.updateDynamic("filterBy")(js.Any.fromFunction2(filterBy))
    if (!js.isUndefined(filterOnLoad)) __obj.updateDynamic("filterOnLoad")(filterOnLoad.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (find != null) __obj.updateDynamic("find")(js.Any.fromFunction6(find))
    if (findBy != null) __obj.updateDynamic("findBy")(js.Any.fromFunction3(findBy))
    if (findExact != null) __obj.updateDynamic("findExact")(js.Any.fromFunction3(findExact))
    if (findRecord != null) __obj.updateDynamic("findRecord")(js.Any.fromFunction6(findRecord))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (first != null) __obj.updateDynamic("first")(js.Any.fromFunction1(first))
    if (generateComparator != null) __obj.updateDynamic("generateComparator")(js.Any.fromFunction0(generateComparator))
    if (getAt != null) __obj.updateDynamic("getAt")(js.Any.fromFunction1(getAt))
    if (getById != null) __obj.updateDynamic("getById")(js.Any.fromFunction1(getById))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getFirstSorter != null) __obj.updateDynamic("getFirstSorter")(js.Any.fromFunction0(getFirstSorter))
    if (getGroupString != null) __obj.updateDynamic("getGroupString")(js.Any.fromFunction1(getGroupString))
    if (getGroups != null) __obj.updateDynamic("getGroups")(js.Any.fromFunction1(getGroups))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getModifiedRecords != null) __obj.updateDynamic("getModifiedRecords")(js.Any.fromFunction0(getModifiedRecords))
    if (getNewRecords != null) __obj.updateDynamic("getNewRecords")(js.Any.fromFunction0(getNewRecords))
    if (getPageFromRecordIndex != null) __obj.updateDynamic("getPageFromRecordIndex")(js.Any.fromFunction1(getPageFromRecordIndex))
    if (getProxy != null) __obj.updateDynamic("getProxy")(js.Any.fromFunction0(getProxy))
    if (getRange != null) __obj.updateDynamic("getRange")(js.Any.fromFunction3(getRange))
    if (getRemovedRecords != null) __obj.updateDynamic("getRemovedRecords")(js.Any.fromFunction0(getRemovedRecords))
    if (getTotalCount != null) __obj.updateDynamic("getTotalCount")(js.Any.fromFunction0(getTotalCount))
    if (getUpdatedRecords != null) __obj.updateDynamic("getUpdatedRecords")(js.Any.fromFunction0(getUpdatedRecords))
    if (group != null) __obj.updateDynamic("group")(js.Any.fromFunction2(group))
    if (groupDir != null) __obj.updateDynamic("groupDir")(groupDir.asInstanceOf[js.Any])
    if (groupField != null) __obj.updateDynamic("groupField")(groupField.asInstanceOf[js.Any])
    if (groupers != null) __obj.updateDynamic("groupers")(groupers.asInstanceOf[js.Any])
    if (guaranteeRange != null) __obj.updateDynamic("guaranteeRange")(js.Any.fromFunction5(guaranteeRange))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1(indexOf))
    if (indexOfId != null) __obj.updateDynamic("indexOfId")(js.Any.fromFunction1(indexOfId))
    if (indexOfTotal != null) __obj.updateDynamic("indexOfTotal")(js.Any.fromFunction1(indexOfTotal))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initSortable != null) __obj.updateDynamic("initSortable")(js.Any.fromFunction0(initSortable))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction2(insert))
    if (!js.isUndefined(isDestroyed)) __obj.updateDynamic("isDestroyed")(isDestroyed.asInstanceOf[js.Any])
    if (isFiltered != null) __obj.updateDynamic("isFiltered")(js.Any.fromFunction0(isFiltered))
    if (isGrouped != null) __obj.updateDynamic("isGrouped")(js.Any.fromFunction0(isGrouped))
    if (isLoading != null) __obj.updateDynamic("isLoading")(js.Any.fromFunction0(isLoading))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.asInstanceOf[js.Any])
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable.asInstanceOf[js.Any])
    if (!js.isUndefined(isStore)) __obj.updateDynamic("isStore")(isStore.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(js.Any.fromFunction1(last))
    if (leadingBufferZone != null) __obj.updateDynamic("leadingBufferZone")(leadingBufferZone.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction2(loadData))
    if (loadPage != null) __obj.updateDynamic("loadPage")(js.Any.fromFunction2(loadPage))
    if (loadRawData != null) __obj.updateDynamic("loadRawData")(js.Any.fromFunction2(loadRawData))
    if (loadRecords != null) __obj.updateDynamic("loadRecords")(js.Any.fromFunction2(loadRecords))
    if (max != null) __obj.updateDynamic("max")(js.Any.fromFunction2(max))
    if (min != null) __obj.updateDynamic("min")(js.Any.fromFunction2(min))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (nextPage != null) __obj.updateDynamic("nextPage")(js.Any.fromFunction1(nextPage))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (prefetch != null) __obj.updateDynamic("prefetch")(js.Any.fromFunction1(prefetch))
    if (prefetchPage != null) __obj.updateDynamic("prefetchPage")(js.Any.fromFunction2(prefetchPage))
    if (prefetchRange != null) __obj.updateDynamic("prefetchRange")(js.Any.fromFunction2(prefetchRange))
    if (previousPage != null) __obj.updateDynamic("previousPage")(js.Any.fromFunction1(previousPage))
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (purgePageCount != null) __obj.updateDynamic("purgePageCount")(purgePageCount.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction5(query))
    if (queryBy != null) __obj.updateDynamic("queryBy")(js.Any.fromFunction2(queryBy))
    if (rejectChanges != null) __obj.updateDynamic("rejectChanges")(js.Any.fromFunction0(rejectChanges))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (reload != null) __obj.updateDynamic("reload")(js.Any.fromFunction1(reload))
    if (!js.isUndefined(remoteFilter)) __obj.updateDynamic("remoteFilter")(remoteFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteGroup)) __obj.updateDynamic("remoteGroup")(remoteGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteSort)) __obj.updateDynamic("remoteSort")(remoteSort.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction1(removeAll))
    if (removeAt != null) __obj.updateDynamic("removeAt")(js.Any.fromFunction2(removeAt))
    if (removeFilter != null) __obj.updateDynamic("removeFilter")(js.Any.fromFunction2(removeFilter))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeAutoSync != null) __obj.updateDynamic("resumeAutoSync")(js.Any.fromFunction0(resumeAutoSync))
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction0(save))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setProxy != null) __obj.updateDynamic("setProxy")(js.Any.fromFunction1(setProxy))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction0(sort))
    if (!js.isUndefined(sortOnFilter)) __obj.updateDynamic("sortOnFilter")(sortOnFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(sortOnLoad)) __obj.updateDynamic("sortOnLoad")(sortOnLoad.asInstanceOf[js.Any])
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot.asInstanceOf[js.Any])
    if (sorters != null) __obj.updateDynamic("sorters")(sorters.asInstanceOf[js.Any])
    if (!js.isUndefined(statefulFilters)) __obj.updateDynamic("statefulFilters")(statefulFilters.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (storeId != null) __obj.updateDynamic("storeId")(storeId.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(js.Any.fromFunction2(sum))
    if (suspendAutoSync != null) __obj.updateDynamic("suspendAutoSync")(js.Any.fromFunction0(suspendAutoSync))
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (sync != null) __obj.updateDynamic("sync")(js.Any.fromFunction1(sync))
    if (trailingBufferZone != null) __obj.updateDynamic("trailingBufferZone")(trailingBufferZone.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStore]
  }
}

