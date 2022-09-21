package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.util.IMixedCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStore
  extends StObject
     with IAbstractStore {
  
  /** [Method] Adds Model instance to the Store
    * @param model Ext.data.Model[]/Ext.data.Model.../Object[]/Object... An array of Model instances or Model configuration objects, or variable number of Model instance or config arguments.
    * @returns Ext.data.Model[] The model instances that were added
    */
  var add: js.UndefOr[js.Function1[/* model */ js.UndefOr[Any], Array]] = js.undefined
  
  /** [Method] Adds a new Filter to this Store s filter set and by default applys the updated filter set to the Store s unfiltered
    * @param filters Object[]/Ext.util.Filter[] The set of filters to add to the current filter set.
    * @param applyFilters Boolean Pass as false to add the filter but not apply the updated filter set.
    */
  var addFilter: js.UndefOr[
    js.Function2[/* filters */ js.UndefOr[Any], /* applyFilters */ js.UndefOr[Boolean], Unit]
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
      /* fn */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      /* grouped */ js.UndefOr[Boolean], 
      /* args */ js.UndefOr[Array], 
      Any
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
    js.Function2[/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean], Any]
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
      /* dataIndex */ js.UndefOr[String], 
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
  var data: js.UndefOr[Any] = js.undefined
  
  /** [Method] Calls the specified function for each record in the store
    * @param fn Function The function to call. The Record is passed as the first parameter. Returning false aborts and exits the iteration.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current record in the iteration.
    */
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Filters the loaded set of records by a given set of filters
    * @param filters Object[]/Ext.util.Filter[]/String The set of filters to apply to the data. These are stored internally on the store, but the filtering itself is done on the Store's MixedCollection. See MixedCollection's filter method for filter syntax. Alternatively, pass in a property string. If no parameters are passed, the Store's existing filter set is applied.
    * @param value String value to filter by (only if using a property string as the first argument)
    */
  var filter: js.UndefOr[
    js.Function2[/* filters */ js.UndefOr[Any], /* value */ js.UndefOr[String], Unit]
  ] = js.undefined
  
  /** [Method] Filters by a function
    * @param fn Function The function to be called. It will be passed the following parameters:
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
    */
  var filterBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Unit]] = js.undefined
  
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
      /* fieldName */ js.UndefOr[String], 
      /* value */ js.UndefOr[Any], 
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
      /* fn */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
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
      /* fieldName */ js.UndefOr[String], 
      /* value */ js.UndefOr[Any], 
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
      /* fieldName */ js.UndefOr[String], 
      /* value */ js.UndefOr[Any], 
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
  var first: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[Boolean], Any]] = js.undefined
  
  /** [Method] Get the Record at the specified index
    * @param index Number The index of the Record to find.
    * @returns Ext.data.Model The Record at the passed index. Returns undefined if not found.
    */
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], IModel]] = js.undefined
  
  /** [Method] Get the Record with the specified id
    * @param id Mixed The id of the Record to find.
    * @returns Ext.data.Model The Record with the passed id. Returns null if not found.
    */
  var getById: js.UndefOr[js.Function1[/* id */ js.UndefOr[Any], IModel]] = js.undefined
  
  /** [Method] Gets the number of records in store
    * @returns Number The number of Records in the Store.
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the string to group on for a given model instance
    * @param instance Ext.data.Model The model instance
    * @returns String The string to compare when forming groups
    */
  var getGroupString: js.UndefOr[js.Function1[/* instance */ js.UndefOr[IModel], String]] = js.undefined
  
  /** [Method] Returns an array containing the result of applying grouping to the records in this store
    * @param groupName String Pass in an optional groupName argument to access a specific group as defined by getGroupString.
    * @returns Object/Object[] The grouped data
    */
  var getGroups: js.UndefOr[js.Function1[/* groupName */ js.UndefOr[String], Any]] = js.undefined
  
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
      /* options */ js.UndefOr[Any], 
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
    js.Function2[/* groupers */ js.UndefOr[Any], /* direction */ js.UndefOr[String], Unit]
  ] = js.undefined
  
  /** [Config Option] (String) */
  var groupDir: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var groupField: js.UndefOr[String] = js.undefined
  
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
      /* start */ js.UndefOr[Any], 
      /* end */ js.UndefOr[Any], 
      /* callback */ js.UndefOr[Any], 
      /* scope */ js.UndefOr[Any], 
      /* options */ js.UndefOr[Any], 
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
  var indexOfId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Double]] = js.undefined
  
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
  var last: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[Boolean], Any]] = js.undefined
  
  /** [Config Option] (Number) */
  var leadingBufferZone: js.UndefOr[Double] = js.undefined
  
  /** [Method] Loads an array of data straight into the Store
    * @param data Ext.data.Model[]/Object[] Array of data to load. Any non-model instances will be cast into model instances first.
    * @param append Boolean true to add the records to the existing records in the store, false to remove the old ones first.
    */
  var loadData: js.UndefOr[js.Function2[/* data */ js.UndefOr[Any], /* append */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Loads a given page of data by setting the start and limit values appropriately
    * @param page Number The number of the page to load.
    * @param options Object See options for load.
    */
  var loadPage: js.UndefOr[js.Function2[/* page */ js.UndefOr[Double], /* options */ js.UndefOr[Any], Unit]] = js.undefined
  
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
    js.Function2[/* records */ js.UndefOr[Array], /* options */ js.UndefOr[Any], Unit]
  ] = js.undefined
  
  /** [Method] Gets the maximum value in the store
    * @param field String The field in each record
    * @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the maximum in the group being the value. The grouped parameter is only honored if the store has a groupField.
    * @returns Object The maximum value, if no items exist, undefined.
    */
  var max: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean], Any]
  ] = js.undefined
  
  /** [Method] Gets the minimum value in the store
    * @param field String The field in each record
    * @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the minimum in the group being the value. The grouped parameter is only honored if the store has a groupField.
    * @returns Object The minimum value, if no items exist, undefined.
    */
  var min: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean], Any]
  ] = js.undefined
  
  /** [Method] Loads the next page in the current data set
    * @param options Object See options for load
    */
  var nextPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Number) */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /** [Method] Prefetches data into the store using its configured proxy
    * @param options Object config object, passed into the Ext.data.Operation object before loading. See load
    */
  var prefetch: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Prefetches a page of data
    * @param page Number The page to prefetch
    * @param options Object config object, passed into the Ext.data.Operation object before loading. See load
    */
  var prefetchPage: js.UndefOr[js.Function2[/* page */ js.UndefOr[Double], /* options */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Ensures that the specified range of rows is present in the cache
    * @param start Object
    * @param end Object
    */
  var prefetchRange: js.UndefOr[js.Function2[/* start */ js.UndefOr[Any], /* end */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Loads the previous page in the current data set
    * @param options Object See options for load
    */
  var previousPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[Any], Unit]] = js.undefined
  
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
      /* property */ js.UndefOr[String], 
      /* value */ js.UndefOr[Any], 
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
    js.Function2[/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], IMixedCollection]
  ] = js.undefined
  
  /** [Method] Rejects outstanding changes on all modified records and re insert any records that were removed locally  */
  var rejectChanges: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var remoteGroup: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Removes the specified record s from the Store firing the remove event for each instance that is removed
    * @param records Ext.data.Model/Ext.data.Model[]/Number/Number[] Model instance or array of instances to remove or an array of indices from which to remove records.
    */
  var remove: js.UndefOr[js.Function1[/* records */ js.UndefOr[Any], Unit]] = js.undefined
  
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
    js.Function2[/* toRemove */ js.UndefOr[Any], /* applyFilters */ js.UndefOr[Boolean], Unit]
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
    js.Function2[/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean], Double]
  ] = js.undefined
  
  /** [Config Option] (Number) */
  var trailingBufferZone: js.UndefOr[Double] = js.undefined
}
object IStore {
  
  inline def apply(): IStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStore]
  }
  
  extension [Self <: IStore](x: Self) {
    
    inline def setAdd(value: /* model */ js.UndefOr[Any] => Array): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddFilter(value: (/* filters */ js.UndefOr[Any], /* applyFilters */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "addFilter", js.Any.fromFunction2(value))
    
    inline def setAddFilterUndefined: Self = StObject.set(x, "addFilter", js.undefined)
    
    inline def setAddSorted(value: /* record */ js.UndefOr[IRecord] => Unit): Self = StObject.set(x, "addSorted", js.Any.fromFunction1(value))
    
    inline def setAddSortedUndefined: Self = StObject.set(x, "addSorted", js.undefined)
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAggregate(
      value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* grouped */ js.UndefOr[Boolean], /* args */ js.UndefOr[Array]) => Any
    ): Self = StObject.set(x, "aggregate", js.Any.fromFunction4(value))
    
    inline def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    inline def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
    
    inline def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
    
    inline def setAverage(value: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => Any): Self = StObject.set(x, "average", js.Any.fromFunction2(value))
    
    inline def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    inline def setBuffered(value: Boolean): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
    
    inline def setBufferedUndefined: Self = StObject.set(x, "buffered", js.undefined)
    
    inline def setClearFilter(value: /* suppressEvent */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "clearFilter", js.Any.fromFunction1(value))
    
    inline def setClearFilterUndefined: Self = StObject.set(x, "clearFilter", js.undefined)
    
    inline def setClearGrouping(value: () => Unit): Self = StObject.set(x, "clearGrouping", js.Any.fromFunction0(value))
    
    inline def setClearGroupingUndefined: Self = StObject.set(x, "clearGrouping", js.undefined)
    
    inline def setClearOnPageLoad(value: Boolean): Self = StObject.set(x, "clearOnPageLoad", value.asInstanceOf[js.Any])
    
    inline def setClearOnPageLoadUndefined: Self = StObject.set(x, "clearOnPageLoad", js.undefined)
    
    inline def setClearRemovedOnLoad(value: Boolean): Self = StObject.set(x, "clearRemovedOnLoad", value.asInstanceOf[js.Any])
    
    inline def setClearRemovedOnLoadUndefined: Self = StObject.set(x, "clearRemovedOnLoad", js.undefined)
    
    inline def setCollect(
      value: (/* dataIndex */ js.UndefOr[String], /* allowNull */ js.UndefOr[Boolean], /* bypassFilter */ js.UndefOr[Boolean]) => Array
    ): Self = StObject.set(x, "collect", js.Any.fromFunction3(value))
    
    inline def setCollectUndefined: Self = StObject.set(x, "collect", js.undefined)
    
    inline def setCommitChanges(value: () => Unit): Self = StObject.set(x, "commitChanges", js.Any.fromFunction0(value))
    
    inline def setCommitChangesUndefined: Self = StObject.set(x, "commitChanges", js.undefined)
    
    inline def setCount(value: /* grouped */ js.UndefOr[Boolean] => Double): Self = StObject.set(x, "count", js.Any.fromFunction1(value))
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEach(value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
    
    inline def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
    
    inline def setFilter(value: (/* filters */ js.UndefOr[Any], /* value */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFilterBy(value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "filterBy", js.Any.fromFunction2(value))
    
    inline def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFind(
      value: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => Double
    ): Self = StObject.set(x, "find", js.Any.fromFunction6(value))
    
    inline def setFindBy(
      value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* startIndex */ js.UndefOr[Double]) => Double
    ): Self = StObject.set(x, "findBy", js.Any.fromFunction3(value))
    
    inline def setFindByUndefined: Self = StObject.set(x, "findBy", js.undefined)
    
    inline def setFindExact(
      value: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[Any], /* startIndex */ js.UndefOr[Double]) => Double
    ): Self = StObject.set(x, "findExact", js.Any.fromFunction3(value))
    
    inline def setFindExactUndefined: Self = StObject.set(x, "findExact", js.undefined)
    
    inline def setFindRecord(
      value: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => IModel
    ): Self = StObject.set(x, "findRecord", js.Any.fromFunction6(value))
    
    inline def setFindRecordUndefined: Self = StObject.set(x, "findRecord", js.undefined)
    
    inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
    
    inline def setFirst(value: /* grouped */ js.UndefOr[Boolean] => Any): Self = StObject.set(x, "first", js.Any.fromFunction1(value))
    
    inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    inline def setGetAt(value: /* index */ js.UndefOr[Double] => IModel): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
    
    inline def setGetAtUndefined: Self = StObject.set(x, "getAt", js.undefined)
    
    inline def setGetById(value: /* id */ js.UndefOr[Any] => IModel): Self = StObject.set(x, "getById", js.Any.fromFunction1(value))
    
    inline def setGetByIdUndefined: Self = StObject.set(x, "getById", js.undefined)
    
    inline def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    inline def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
    
    inline def setGetGroupString(value: /* instance */ js.UndefOr[IModel] => String): Self = StObject.set(x, "getGroupString", js.Any.fromFunction1(value))
    
    inline def setGetGroupStringUndefined: Self = StObject.set(x, "getGroupString", js.undefined)
    
    inline def setGetGroups(value: /* groupName */ js.UndefOr[String] => Any): Self = StObject.set(x, "getGroups", js.Any.fromFunction1(value))
    
    inline def setGetGroupsUndefined: Self = StObject.set(x, "getGroups", js.undefined)
    
    inline def setGetPageFromRecordIndex(value: /* index */ js.UndefOr[Double] => Double): Self = StObject.set(x, "getPageFromRecordIndex", js.Any.fromFunction1(value))
    
    inline def setGetPageFromRecordIndexUndefined: Self = StObject.set(x, "getPageFromRecordIndex", js.undefined)
    
    inline def setGetRange(
      value: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], /* options */ js.UndefOr[Any]) => Array
    ): Self = StObject.set(x, "getRange", js.Any.fromFunction3(value))
    
    inline def setGetRangeUndefined: Self = StObject.set(x, "getRange", js.undefined)
    
    inline def setGetTotalCount(value: () => Double): Self = StObject.set(x, "getTotalCount", js.Any.fromFunction0(value))
    
    inline def setGetTotalCountUndefined: Self = StObject.set(x, "getTotalCount", js.undefined)
    
    inline def setGroup(value: (/* groupers */ js.UndefOr[Any], /* direction */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "group", js.Any.fromFunction2(value))
    
    inline def setGroupDir(value: String): Self = StObject.set(x, "groupDir", value.asInstanceOf[js.Any])
    
    inline def setGroupDirUndefined: Self = StObject.set(x, "groupDir", js.undefined)
    
    inline def setGroupField(value: String): Self = StObject.set(x, "groupField", value.asInstanceOf[js.Any])
    
    inline def setGroupFieldUndefined: Self = StObject.set(x, "groupField", js.undefined)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setGroupers(value: IMixedCollection): Self = StObject.set(x, "groupers", value.asInstanceOf[js.Any])
    
    inline def setGroupersUndefined: Self = StObject.set(x, "groupers", js.undefined)
    
    inline def setGuaranteeRange(
      value: (/* start */ js.UndefOr[Any], /* end */ js.UndefOr[Any], /* callback */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* options */ js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "guaranteeRange", js.Any.fromFunction5(value))
    
    inline def setGuaranteeRangeUndefined: Self = StObject.set(x, "guaranteeRange", js.undefined)
    
    inline def setIndexOf(value: /* record */ js.UndefOr[IModel] => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setIndexOfId(value: /* id */ js.UndefOr[String] => Double): Self = StObject.set(x, "indexOfId", js.Any.fromFunction1(value))
    
    inline def setIndexOfIdUndefined: Self = StObject.set(x, "indexOfId", js.undefined)
    
    inline def setIndexOfTotal(value: /* record */ js.UndefOr[IModel] => Double): Self = StObject.set(x, "indexOfTotal", js.Any.fromFunction1(value))
    
    inline def setIndexOfTotalUndefined: Self = StObject.set(x, "indexOfTotal", js.undefined)
    
    inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
    
    inline def setInsert(value: (/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array]) => Array): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
    
    inline def setIsFiltered(value: () => Boolean): Self = StObject.set(x, "isFiltered", js.Any.fromFunction0(value))
    
    inline def setIsFilteredUndefined: Self = StObject.set(x, "isFiltered", js.undefined)
    
    inline def setIsGrouped(value: () => Boolean): Self = StObject.set(x, "isGrouped", js.Any.fromFunction0(value))
    
    inline def setIsGroupedUndefined: Self = StObject.set(x, "isGrouped", js.undefined)
    
    inline def setLast(value: /* grouped */ js.UndefOr[Boolean] => Any): Self = StObject.set(x, "last", js.Any.fromFunction1(value))
    
    inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    inline def setLeadingBufferZone(value: Double): Self = StObject.set(x, "leadingBufferZone", value.asInstanceOf[js.Any])
    
    inline def setLeadingBufferZoneUndefined: Self = StObject.set(x, "leadingBufferZone", js.undefined)
    
    inline def setLoadData(value: (/* data */ js.UndefOr[Any], /* append */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "loadData", js.Any.fromFunction2(value))
    
    inline def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
    
    inline def setLoadPage(value: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "loadPage", js.Any.fromFunction2(value))
    
    inline def setLoadPageUndefined: Self = StObject.set(x, "loadPage", js.undefined)
    
    inline def setLoadRawData(value: (/* data */ js.UndefOr[Array], /* append */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "loadRawData", js.Any.fromFunction2(value))
    
    inline def setLoadRawDataUndefined: Self = StObject.set(x, "loadRawData", js.undefined)
    
    inline def setLoadRecords(value: (/* records */ js.UndefOr[Array], /* options */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "loadRecords", js.Any.fromFunction2(value))
    
    inline def setLoadRecordsUndefined: Self = StObject.set(x, "loadRecords", js.undefined)
    
    inline def setMax(value: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => Any): Self = StObject.set(x, "max", js.Any.fromFunction2(value))
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => Any): Self = StObject.set(x, "min", js.Any.fromFunction2(value))
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setNextPage(value: /* options */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "nextPage", js.Any.fromFunction1(value))
    
    inline def setNextPageUndefined: Self = StObject.set(x, "nextPage", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPrefetch(value: /* options */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "prefetch", js.Any.fromFunction1(value))
    
    inline def setPrefetchPage(value: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "prefetchPage", js.Any.fromFunction2(value))
    
    inline def setPrefetchPageUndefined: Self = StObject.set(x, "prefetchPage", js.undefined)
    
    inline def setPrefetchRange(value: (/* start */ js.UndefOr[Any], /* end */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "prefetchRange", js.Any.fromFunction2(value))
    
    inline def setPrefetchRangeUndefined: Self = StObject.set(x, "prefetchRange", js.undefined)
    
    inline def setPrefetchUndefined: Self = StObject.set(x, "prefetch", js.undefined)
    
    inline def setPreviousPage(value: /* options */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "previousPage", js.Any.fromFunction1(value))
    
    inline def setPreviousPageUndefined: Self = StObject.set(x, "previousPage", js.undefined)
    
    inline def setPurgePageCount(value: Double): Self = StObject.set(x, "purgePageCount", value.asInstanceOf[js.Any])
    
    inline def setPurgePageCountUndefined: Self = StObject.set(x, "purgePageCount", js.undefined)
    
    inline def setQuery(
      value: (/* property */ js.UndefOr[String], /* value */ js.UndefOr[Any], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => IMixedCollection
    ): Self = StObject.set(x, "query", js.Any.fromFunction5(value))
    
    inline def setQueryBy(value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => IMixedCollection): Self = StObject.set(x, "queryBy", js.Any.fromFunction2(value))
    
    inline def setQueryByUndefined: Self = StObject.set(x, "queryBy", js.undefined)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRejectChanges(value: () => Unit): Self = StObject.set(x, "rejectChanges", js.Any.fromFunction0(value))
    
    inline def setRejectChangesUndefined: Self = StObject.set(x, "rejectChanges", js.undefined)
    
    inline def setRemoteGroup(value: Boolean): Self = StObject.set(x, "remoteGroup", value.asInstanceOf[js.Any])
    
    inline def setRemoteGroupUndefined: Self = StObject.set(x, "remoteGroup", js.undefined)
    
    inline def setRemove(value: /* records */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRemoveAll(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "removeAll", js.Any.fromFunction1(value))
    
    inline def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
    
    inline def setRemoveAt(value: (/* index */ js.UndefOr[Double], /* count */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "removeAt", js.Any.fromFunction2(value))
    
    inline def setRemoveAtUndefined: Self = StObject.set(x, "removeAt", js.undefined)
    
    inline def setRemoveFilter(value: (/* toRemove */ js.UndefOr[Any], /* applyFilters */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "removeFilter", js.Any.fromFunction2(value))
    
    inline def setRemoveFilterUndefined: Self = StObject.set(x, "removeFilter", js.undefined)
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setSnapshot(value: IMixedCollection): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
    
    inline def setSort(value: () => Array): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
    
    inline def setSortOnFilter(value: Boolean): Self = StObject.set(x, "sortOnFilter", value.asInstanceOf[js.Any])
    
    inline def setSortOnFilterUndefined: Self = StObject.set(x, "sortOnFilter", js.undefined)
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSum(value: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => Double): Self = StObject.set(x, "sum", js.Any.fromFunction2(value))
    
    inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
    
    inline def setTrailingBufferZone(value: Double): Self = StObject.set(x, "trailingBufferZone", value.asInstanceOf[js.Any])
    
    inline def setTrailingBufferZoneUndefined: Self = StObject.set(x, "trailingBufferZone", js.undefined)
  }
}
