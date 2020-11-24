package typings.extjs.Ext.data

import typings.extjs.Ext.Array
import typings.extjs.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStore extends IAbstractStore {
  
  /** [Method] Adds Model instance to the Store
    * @param model Ext.data.Model[]/Ext.data.Model.../Object[]/Object... An array of Model instances or Model configuration objects, or variable number of Model instance or config arguments.
    * @returns Ext.data.Model[] The model instances that were added
    */
  var add: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], Array]] = js.native
  
  /** [Method] Adds a new Filter to this Store s filter set and by default applys the updated filter set to the Store s unfiltered
    * @param filters Object[]/Ext.util.Filter[] The set of filters to add to the current filter set.
    * @param applyFilters Boolean Pass as false to add the filter but not apply the updated filter set.
    */
  var addFilter: js.UndefOr[
    js.Function2[/* filters */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Method] Local sort only Inserts the passed Record into the Store at the index where it should go based on the current sort
    * @param record Ext.data.Record
    */
  var addSorted: js.UndefOr[js.Function1[/* record */ js.UndefOr[IRecord], Unit]] = js.native
  
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
  ] = js.native
  
  /** [Config Option] (Boolean) */
  var autoDestroy: js.UndefOr[Boolean] = js.native
  
  /** [Method] Gets the average value in the store
    * @param field String The field in each record
    * @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the group average being the value. The grouped parameter is only honored if the store has a groupField.
    * @returns Object The average value, if no items exist, 0.
    */
  var average: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean], _]
  ] = js.native
  
  /** [Config Option] (Boolean) */
  var buffered: js.UndefOr[Boolean] = js.native
  
  /** [Method] Reverts to a view of the Record cache with no filtering applied
    * @param suppressEvent Boolean If true the filter is cleared silently. For a locally filtered Store, this means that the filter collection is cleared without firing the datachanged event. For a remotely filtered Store, this means that the filter collection is cleared, but the store is not reloaded from the server.
    */
  var clearFilter: js.UndefOr[js.Function1[/* suppressEvent */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Clear any groupers in the store */
  var clearGrouping: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var clearOnPageLoad: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var clearRemovedOnLoad: js.UndefOr[Boolean] = js.native
  
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
  ] = js.native
  
  /** [Method] Commits all Records with outstanding changes  */
  var commitChanges: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Gets the count of items in the store
    * @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the count for each group being the value. The grouped parameter is only honored if the store has a groupField.
    * @returns Number the count
    */
  var count: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[Boolean], Double]] = js.native
  
  /** [Property] (Number) */
  var currentPage: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Object[]/Ext.data.Model[]) */
  var data: js.UndefOr[js.Any] = js.native
  
  /** [Method] Calls the specified function for each record in the store
    * @param fn Function The function to call. The Record is passed as the first parameter. Returning false aborts and exits the iteration.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current record in the iteration.
    */
  var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Filters the loaded set of records by a given set of filters
    * @param filters Object[]/Ext.util.Filter[]/String The set of filters to apply to the data. These are stored internally on the store, but the filtering itself is done on the Store's MixedCollection. See MixedCollection's filter method for filter syntax. Alternatively, pass in a property string. If no parameters are passed, the Store's existing filter set is applied.
    * @param value String value to filter by (only if using a property string as the first argument)
    */
  var filter: js.UndefOr[
    js.Function2[/* filters */ js.UndefOr[js.Any], /* value */ js.UndefOr[String], Unit]
  ] = js.native
  
  /** [Method] Filters by a function
    * @param fn Function The function to be called. It will be passed the following parameters:
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to this Store.
    */
  var filterBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  
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
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      /* exactMatch */ js.UndefOr[Boolean], 
      Double
    ]
  ] = js.native
  
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
  ] = js.native
  
  /** [Method] Finds the index of the first matching Record in this store by a specific field value
    * @param fieldName String The name of the Record field to test.
    * @param value Object The value to match the field against.
    * @param startIndex Number The index to start searching at
    * @returns Number The matched index or -1
    */
  var findExact: js.UndefOr[
    js.Function3[
      /* fieldName */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      Double
    ]
  ] = js.native
  
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
      /* value */ js.UndefOr[js.Any], 
      /* startIndex */ js.UndefOr[Double], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      /* exactMatch */ js.UndefOr[Boolean], 
      IModel
    ]
  ] = js.native
  
  /** [Method] Convenience function for getting the first model instance in the store
    * @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the first record being the value. The grouped parameter is only honored if the store has a groupField.
    * @returns Ext.data.Model/undefined The first model instance in the store, or undefined
    */
  var first: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[Boolean], _]] = js.native
  
  /** [Method] Get the Record at the specified index
    * @param index Number The index of the Record to find.
    * @returns Ext.data.Model The Record at the passed index. Returns undefined if not found.
    */
  var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], IModel]] = js.native
  
  /** [Method] Get the Record with the specified id
    * @param id Mixed The id of the Record to find.
    * @returns Ext.data.Model The Record with the passed id. Returns null if not found.
    */
  var getById: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], IModel]] = js.native
  
  /** [Method] Gets the number of records in store
    * @returns Number The number of Records in the Store.
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the string to group on for a given model instance
    * @param instance Ext.data.Model The model instance
    * @returns String The string to compare when forming groups
    */
  var getGroupString: js.UndefOr[js.Function1[/* instance */ js.UndefOr[IModel], String]] = js.native
  
  /** [Method] Returns an array containing the result of applying grouping to the records in this store
    * @param groupName String Pass in an optional groupName argument to access a specific group as defined by getGroupString.
    * @returns Object/Object[] The grouped data
    */
  var getGroups: js.UndefOr[js.Function1[/* groupName */ js.UndefOr[String], _]] = js.native
  
  /** [Method] Determines the page from a record index
    * @param index Number The record index
    * @returns Number The page the record belongs to
    */
  var getPageFromRecordIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Double]] = js.native
  
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
  ] = js.native
  
  /** [Method] Returns the total number of Model instances that the Proxy indicates exist
    * @returns Number The total number of Model instances available via the Proxy. 0 returned if no value has been set via the reader.
    */
  var getTotalCount: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Groups data inside the store
    * @param groupers String/Object[] Either a string name of one of the fields in this Store's configured Model, or an Array of grouper configurations.
    * @param direction String The overall direction to group the data by.
    */
  var group: js.UndefOr[
    js.Function2[/* groupers */ js.UndefOr[js.Any], /* direction */ js.UndefOr[String], Unit]
  ] = js.native
  
  /** [Config Option] (String) */
  var groupDir: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var groupField: js.UndefOr[String] = js.native
  
  /** [Config Option] (Ext.util.MixedCollection) */
  var groupers: js.UndefOr[IMixedCollection] = js.native
  
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
  ] = js.native
  
  /** [Method] Get the index of the record within the store
    * @param record Ext.data.Model The Ext.data.Model object to find.
    * @returns Number The index of the passed Record. Returns -1 if not found.
    */
  var indexOf: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Double]] = js.native
  
  /** [Method] Get the index within the store of the Record with the passed id
    * @param id String The id of the Record to find.
    * @returns Number The index of the Record. Returns -1 if not found.
    */
  var indexOfId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Double]] = js.native
  
  /** [Method] Get the index within the entire dataset
    * @param record Ext.data.Model The Ext.data.Model object to find.
    * @returns Number The index of the passed Record. Returns -1 if not found.
    */
  var indexOfTotal: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Double]] = js.native
  
  /** [Method] Inserts Model instances into the Store at the given index and fires the add event
    * @param index Number The start index at which to insert the passed Records.
    * @param records Ext.data.Model[] An Array of Ext.data.Model objects to add to the store.
    * @returns Ext.data.Model[] records The added records
    */
  var insert: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array], Array]
  ] = js.native
  
  /** [Method] Returns true if this store is currently filtered
    * @returns Boolean
    */
  var isFiltered: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Checks if the store is currently grouped
    * @returns Boolean true if the store is grouped.
    */
  var isGrouped: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Convenience function for getting the last model instance in the store
    * @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the last record being the value. The grouped parameter is only honored if the store has a groupField.
    * @returns Ext.data.Model/undefined The last model instance in the store, or undefined
    */
  var last: js.UndefOr[js.Function1[/* grouped */ js.UndefOr[Boolean], _]] = js.native
  
  /** [Config Option] (Number) */
  var leadingBufferZone: js.UndefOr[Double] = js.native
  
  /** [Method] Loads an array of data straight into the Store
    * @param data Ext.data.Model[]/Object[] Array of data to load. Any non-model instances will be cast into model instances first.
    * @param append Boolean true to add the records to the existing records in the store, false to remove the old ones first.
    */
  var loadData: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Method] Loads a given page of data by setting the start and limit values appropriately
    * @param page Number The number of the page to load.
    * @param options Object See options for load.
    */
  var loadPage: js.UndefOr[
    js.Function2[/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] Loads data via the bound Proxy s reader Use this method if you are attempting to load data and want to utilize the c
    * @param data Object[] The full JSON object you'd like to load into the Data store.
    * @param append Boolean true to add the records to the existing records in the store, false to remove the old ones first.
    */
  var loadRawData: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[Array], /* append */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Method] Loads an array of model instances into the store fires the datachanged event
    * @param records Ext.data.Model[] The array of records to load
    * @param options Object
    */
  var loadRecords: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[Array], /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] Gets the maximum value in the store
    * @param field String The field in each record
    * @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the maximum in the group being the value. The grouped parameter is only honored if the store has a groupField.
    * @returns Object The maximum value, if no items exist, undefined.
    */
  var max: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean], _]
  ] = js.native
  
  /** [Method] Gets the minimum value in the store
    * @param field String The field in each record
    * @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the minimum in the group being the value. The grouped parameter is only honored if the store has a groupField.
    * @returns Object The minimum value, if no items exist, undefined.
    */
  var min: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean], _]
  ] = js.native
  
  /** [Method] Loads the next page in the current data set
    * @param options Object See options for load
    */
  var nextPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var pageSize: js.UndefOr[Double] = js.native
  
  /** [Method] Prefetches data into the store using its configured proxy
    * @param options Object config object, passed into the Ext.data.Operation object before loading. See load
    */
  var prefetch: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Prefetches a page of data
    * @param page Number The page to prefetch
    * @param options Object config object, passed into the Ext.data.Operation object before loading. See load
    */
  var prefetchPage: js.UndefOr[
    js.Function2[/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] Ensures that the specified range of rows is present in the cache
    * @param start Object
    * @param end Object
    */
  var prefetchRange: js.UndefOr[js.Function2[/* start */ js.UndefOr[js.Any], /* end */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Loads the previous page in the current data set
    * @param options Object See options for load
    */
  var previousPage: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var purgePageCount: js.UndefOr[Double] = js.native
  
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
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[Boolean], 
      /* caseSensitive */ js.UndefOr[Boolean], 
      /* exactMatch */ js.UndefOr[Boolean], 
      IMixedCollection
    ]
  ] = js.native
  
  /** [Method] Query all the cached records in this Store using a filtering function
    * @param fn Function The function to be called. It will be passed the following parameters:
    * @param scope Object The scope (this reference) in which the function is executed Defaults to this Store.
    * @returns Ext.util.MixedCollection Returns an Ext.util.MixedCollection of the matched records
    */
  var queryBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], IMixedCollection]
  ] = js.native
  
  /** [Method] Rejects outstanding changes on all modified records and re insert any records that were removed locally  */
  var rejectChanges: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var remoteGroup: js.UndefOr[Boolean] = js.native
  
  /** [Method] Removes the specified record s from the Store firing the remove event for each instance that is removed
    * @param records Ext.data.Model/Ext.data.Model[]/Number/Number[] Model instance or array of instances to remove or an array of indices from which to remove records.
    */
  var remove: js.UndefOr[js.Function1[/* records */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Removes all items from the store
    * @param silent Boolean Pass true to prevent the record bulkremove and clear events from being fired.
    */
  @JSName("removeAll")
  var removeAll_IStore: js.UndefOr[js.Function1[/* silent */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Removes the model instance s at the given index
    * @param index Number The record index
    * @param count Number The number of records to delete
    */
  var removeAt: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* count */ js.UndefOr[Double], Unit]
  ] = js.native
  
  /** [Method] Removes an individual Filter from the current filter set using the passed Filter Filter id and by default applys the
    * @param toRemove Mixed The id of a Filter to remove from the filter set, or a Filter instance to remove.
    * @param applyFilters Boolean Pass as false to remove the filter but not apply the updated filter set. If null is passed, all anonymous Filters (Filters with no id property) will be removed.
    */
  var removeFilter: js.UndefOr[
    js.Function2[/* toRemove */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Property] (Ext.util.MixedCollection) */
  var snapshot: js.UndefOr[IMixedCollection] = js.native
  
  /** [Config Option] (Boolean) */
  var sortOnFilter: js.UndefOr[Boolean] = js.native
  
  /** [Method] because prefetchData is stored by index this invalidates all of the prefetchedData
    * @returns Ext.util.Sorter[]
    */
  @JSName("sort")
  var sort_IStore: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Sums the value of field for each record in store and returns the result
    * @param field String A field in each record
    * @param grouped Boolean True to perform the operation for each group in the store. The value returned will be an object literal with the key being the group name and the sum for that group being the value. The grouped parameter is only honored if the store has a groupField.
    * @returns Number The sum
    */
  var sum: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean], Double]
  ] = js.native
  
  /** [Config Option] (Number) */
  var trailingBufferZone: js.UndefOr[Double] = js.native
}
object IStore {
  
  @scala.inline
  def apply(): IStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStore]
  }
  
  @scala.inline
  implicit class IStoreOps[Self <: IStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: /* model */ js.UndefOr[js.Any] => Array): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setAddFilter(value: (/* filters */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[Boolean]) => Unit): Self = this.set("addFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAddFilter: Self = this.set("addFilter", js.undefined)
    
    @scala.inline
    def setAddSorted(value: /* record */ js.UndefOr[IRecord] => Unit): Self = this.set("addSorted", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddSorted: Self = this.set("addSorted", js.undefined)
    
    @scala.inline
    def setAggregate(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* grouped */ js.UndefOr[Boolean], /* args */ js.UndefOr[Array]) => _
    ): Self = this.set("aggregate", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteAggregate: Self = this.set("aggregate", js.undefined)
    
    @scala.inline
    def setAutoDestroy(value: Boolean): Self = this.set("autoDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDestroy: Self = this.set("autoDestroy", js.undefined)
    
    @scala.inline
    def setAverage(value: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => _): Self = this.set("average", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAverage: Self = this.set("average", js.undefined)
    
    @scala.inline
    def setBuffered(value: Boolean): Self = this.set("buffered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffered: Self = this.set("buffered", js.undefined)
    
    @scala.inline
    def setClearFilter(value: /* suppressEvent */ js.UndefOr[Boolean] => Unit): Self = this.set("clearFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClearFilter: Self = this.set("clearFilter", js.undefined)
    
    @scala.inline
    def setClearGrouping(value: () => Unit): Self = this.set("clearGrouping", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClearGrouping: Self = this.set("clearGrouping", js.undefined)
    
    @scala.inline
    def setClearOnPageLoad(value: Boolean): Self = this.set("clearOnPageLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearOnPageLoad: Self = this.set("clearOnPageLoad", js.undefined)
    
    @scala.inline
    def setClearRemovedOnLoad(value: Boolean): Self = this.set("clearRemovedOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearRemovedOnLoad: Self = this.set("clearRemovedOnLoad", js.undefined)
    
    @scala.inline
    def setCollect(
      value: (/* dataIndex */ js.UndefOr[String], /* allowNull */ js.UndefOr[Boolean], /* bypassFilter */ js.UndefOr[Boolean]) => Array
    ): Self = this.set("collect", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCollect: Self = this.set("collect", js.undefined)
    
    @scala.inline
    def setCommitChanges(value: () => Unit): Self = this.set("commitChanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCommitChanges: Self = this.set("commitChanges", js.undefined)
    
    @scala.inline
    def setCount(value: /* grouped */ js.UndefOr[Boolean] => Double): Self = this.set("count", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setCurrentPage(value: Double): Self = this.set("currentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPage: Self = this.set("currentPage", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEach(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = this.set("each", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEach: Self = this.set("each", js.undefined)
    
    @scala.inline
    def setFilter(value: (/* filters */ js.UndefOr[js.Any], /* value */ js.UndefOr[String]) => Unit): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFilterBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = this.set("filterBy", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilterBy: Self = this.set("filterBy", js.undefined)
    
    @scala.inline
    def setFind(
      value: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => Double
    ): Self = this.set("find", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteFind: Self = this.set("find", js.undefined)
    
    @scala.inline
    def setFindBy(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => Double
    ): Self = this.set("findBy", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFindBy: Self = this.set("findBy", js.undefined)
    
    @scala.inline
    def setFindExact(
      value: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double]) => Double
    ): Self = this.set("findExact", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFindExact: Self = this.set("findExact", js.undefined)
    
    @scala.inline
    def setFindRecord(
      value: (/* fieldName */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => IModel
    ): Self = this.set("findRecord", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteFindRecord: Self = this.set("findRecord", js.undefined)
    
    @scala.inline
    def setFirst(value: /* grouped */ js.UndefOr[Boolean] => _): Self = this.set("first", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    
    @scala.inline
    def setGetAt(value: /* index */ js.UndefOr[Double] => IModel): Self = this.set("getAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetAt: Self = this.set("getAt", js.undefined)
    
    @scala.inline
    def setGetById(value: /* id */ js.UndefOr[js.Any] => IModel): Self = this.set("getById", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetById: Self = this.set("getById", js.undefined)
    
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCount: Self = this.set("getCount", js.undefined)
    
    @scala.inline
    def setGetGroupString(value: /* instance */ js.UndefOr[IModel] => String): Self = this.set("getGroupString", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetGroupString: Self = this.set("getGroupString", js.undefined)
    
    @scala.inline
    def setGetGroups(value: /* groupName */ js.UndefOr[String] => _): Self = this.set("getGroups", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetGroups: Self = this.set("getGroups", js.undefined)
    
    @scala.inline
    def setGetPageFromRecordIndex(value: /* index */ js.UndefOr[Double] => Double): Self = this.set("getPageFromRecordIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetPageFromRecordIndex: Self = this.set("getPageFromRecordIndex", js.undefined)
    
    @scala.inline
    def setGetRange(
      value: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Array
    ): Self = this.set("getRange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteGetRange: Self = this.set("getRange", js.undefined)
    
    @scala.inline
    def setGetTotalCount(value: () => Double): Self = this.set("getTotalCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTotalCount: Self = this.set("getTotalCount", js.undefined)
    
    @scala.inline
    def setGroup(value: (/* groupers */ js.UndefOr[js.Any], /* direction */ js.UndefOr[String]) => Unit): Self = this.set("group", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setGroupDir(value: String): Self = this.set("groupDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupDir: Self = this.set("groupDir", js.undefined)
    
    @scala.inline
    def setGroupField(value: String): Self = this.set("groupField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupField: Self = this.set("groupField", js.undefined)
    
    @scala.inline
    def setGroupers(value: IMixedCollection): Self = this.set("groupers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupers: Self = this.set("groupers", js.undefined)
    
    @scala.inline
    def setGuaranteeRange(
      value: (/* start */ js.UndefOr[js.Any], /* end */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("guaranteeRange", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteGuaranteeRange: Self = this.set("guaranteeRange", js.undefined)
    
    @scala.inline
    def setIndexOf(value: /* record */ js.UndefOr[IModel] => Double): Self = this.set("indexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIndexOf: Self = this.set("indexOf", js.undefined)
    
    @scala.inline
    def setIndexOfId(value: /* id */ js.UndefOr[String] => Double): Self = this.set("indexOfId", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIndexOfId: Self = this.set("indexOfId", js.undefined)
    
    @scala.inline
    def setIndexOfTotal(value: /* record */ js.UndefOr[IModel] => Double): Self = this.set("indexOfTotal", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIndexOfTotal: Self = this.set("indexOfTotal", js.undefined)
    
    @scala.inline
    def setInsert(value: (/* index */ js.UndefOr[Double], /* records */ js.UndefOr[Array]) => Array): Self = this.set("insert", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    
    @scala.inline
    def setIsFiltered(value: () => Boolean): Self = this.set("isFiltered", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsFiltered: Self = this.set("isFiltered", js.undefined)
    
    @scala.inline
    def setIsGrouped(value: () => Boolean): Self = this.set("isGrouped", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsGrouped: Self = this.set("isGrouped", js.undefined)
    
    @scala.inline
    def setLast(value: /* grouped */ js.UndefOr[Boolean] => _): Self = this.set("last", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    
    @scala.inline
    def setLeadingBufferZone(value: Double): Self = this.set("leadingBufferZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeadingBufferZone: Self = this.set("leadingBufferZone", js.undefined)
    
    @scala.inline
    def setLoadData(value: (/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[Boolean]) => Unit): Self = this.set("loadData", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLoadData: Self = this.set("loadData", js.undefined)
    
    @scala.inline
    def setLoadPage(value: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("loadPage", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLoadPage: Self = this.set("loadPage", js.undefined)
    
    @scala.inline
    def setLoadRawData(value: (/* data */ js.UndefOr[Array], /* append */ js.UndefOr[Boolean]) => Unit): Self = this.set("loadRawData", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLoadRawData: Self = this.set("loadRawData", js.undefined)
    
    @scala.inline
    def setLoadRecords(value: (/* records */ js.UndefOr[Array], /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("loadRecords", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLoadRecords: Self = this.set("loadRecords", js.undefined)
    
    @scala.inline
    def setMax(value: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => _): Self = this.set("max", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => _): Self = this.set("min", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setNextPage(value: /* options */ js.UndefOr[js.Any] => Unit): Self = this.set("nextPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNextPage: Self = this.set("nextPage", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPrefetch(value: /* options */ js.UndefOr[js.Any] => Unit): Self = this.set("prefetch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePrefetch: Self = this.set("prefetch", js.undefined)
    
    @scala.inline
    def setPrefetchPage(value: (/* page */ js.UndefOr[Double], /* options */ js.UndefOr[js.Any]) => Unit): Self = this.set("prefetchPage", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePrefetchPage: Self = this.set("prefetchPage", js.undefined)
    
    @scala.inline
    def setPrefetchRange(value: (/* start */ js.UndefOr[js.Any], /* end */ js.UndefOr[js.Any]) => Unit): Self = this.set("prefetchRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePrefetchRange: Self = this.set("prefetchRange", js.undefined)
    
    @scala.inline
    def setPreviousPage(value: /* options */ js.UndefOr[js.Any] => Unit): Self = this.set("previousPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePreviousPage: Self = this.set("previousPage", js.undefined)
    
    @scala.inline
    def setPurgePageCount(value: Double): Self = this.set("purgePageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurgePageCount: Self = this.set("purgePageCount", js.undefined)
    
    @scala.inline
    def setQuery(
      value: (/* property */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean], /* exactMatch */ js.UndefOr[Boolean]) => IMixedCollection
    ): Self = this.set("query", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setQueryBy(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMixedCollection): Self = this.set("queryBy", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteQueryBy: Self = this.set("queryBy", js.undefined)
    
    @scala.inline
    def setRejectChanges(value: () => Unit): Self = this.set("rejectChanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRejectChanges: Self = this.set("rejectChanges", js.undefined)
    
    @scala.inline
    def setRemoteGroup(value: Boolean): Self = this.set("remoteGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteGroup: Self = this.set("remoteGroup", js.undefined)
    
    @scala.inline
    def setRemove(value: /* records */ js.UndefOr[js.Any] => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setRemoveAll(value: /* silent */ js.UndefOr[Boolean] => Unit): Self = this.set("removeAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveAll: Self = this.set("removeAll", js.undefined)
    
    @scala.inline
    def setRemoveAt(value: (/* index */ js.UndefOr[Double], /* count */ js.UndefOr[Double]) => Unit): Self = this.set("removeAt", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemoveAt: Self = this.set("removeAt", js.undefined)
    
    @scala.inline
    def setRemoveFilter(value: (/* toRemove */ js.UndefOr[js.Any], /* applyFilters */ js.UndefOr[Boolean]) => Unit): Self = this.set("removeFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemoveFilter: Self = this.set("removeFilter", js.undefined)
    
    @scala.inline
    def setSnapshot(value: IMixedCollection): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshot: Self = this.set("snapshot", js.undefined)
    
    @scala.inline
    def setSort(value: () => Array): Self = this.set("sort", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setSortOnFilter(value: Boolean): Self = this.set("sortOnFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOnFilter: Self = this.set("sortOnFilter", js.undefined)
    
    @scala.inline
    def setSum(value: (/* field */ js.UndefOr[String], /* grouped */ js.UndefOr[Boolean]) => Double): Self = this.set("sum", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSum: Self = this.set("sum", js.undefined)
    
    @scala.inline
    def setTrailingBufferZone(value: Double): Self = this.set("trailingBufferZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailingBufferZone: Self = this.set("trailingBufferZone", js.undefined)
  }
}
