package typings.extjs.Ext

import typings.extjs.Ext.dd.IDragSource
import typings.extjs.Ext.util.IAnimate
import typings.extjs.Ext.util.IMixedCollection
import typings.extjs.Ext.util.IObservable
import typings.extjs.Ext.util.IRegion
import typings.extjs.Ext.util.ISorter
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draw {
  
  trait Color extends StObject
  
  trait Draw extends StObject
  
  trait IColor
    extends StObject
       with IBase {
    
    /** [Method] Get the blue component of the color in the range 0 255
      * @returns Number
      */
    var getBlue: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Return a new color that is darker than this color
      * @param factor Number Darker factor (0..1), default to 0.2
      * @returns Object Ext.draw.Color
      */
    var getDarker: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], Any]] = js.undefined
    
    /** [Method] Returns the gray value 0 to 255 of the color
      * @returns Number
      */
    var getGrayscale: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Get the green component of the color in the range 0 255
      * @returns Number
      */
    var getGreen: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Get the equivalent HSL components of the color
      * @returns Number[]
      */
    var getHSL: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Return a new color that is lighter than this color
      * @param factor Number Lighter factor (0..1), default to 0.2
      * @returns Object Ext.draw.Color
      */
    var getLighter: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], Any]] = js.undefined
    
    /** [Method] Get the RGB values
      * @returns Number[]
      */
    var getRGB: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Get the red component of the color in the range 0 255
      * @returns Number
      */
    var getRed: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Config Option] (Number) */
    var lightnessFactor: js.UndefOr[Double] = js.undefined
    
    /** [Method] Return the color in the hex format i e
      * @returns String
      */
    @JSName("toString")
    var toString_FIColor: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  }
  object IColor {
    
    inline def apply(): IColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColor]
    }
    
    extension [Self <: IColor](x: Self) {
      
      inline def setGetBlue(value: () => Double): Self = StObject.set(x, "getBlue", js.Any.fromFunction0(value))
      
      inline def setGetBlueUndefined: Self = StObject.set(x, "getBlue", js.undefined)
      
      inline def setGetDarker(value: /* factor */ js.UndefOr[Double] => Any): Self = StObject.set(x, "getDarker", js.Any.fromFunction1(value))
      
      inline def setGetDarkerUndefined: Self = StObject.set(x, "getDarker", js.undefined)
      
      inline def setGetGrayscale(value: () => Double): Self = StObject.set(x, "getGrayscale", js.Any.fromFunction0(value))
      
      inline def setGetGrayscaleUndefined: Self = StObject.set(x, "getGrayscale", js.undefined)
      
      inline def setGetGreen(value: () => Double): Self = StObject.set(x, "getGreen", js.Any.fromFunction0(value))
      
      inline def setGetGreenUndefined: Self = StObject.set(x, "getGreen", js.undefined)
      
      inline def setGetHSL(value: () => Array): Self = StObject.set(x, "getHSL", js.Any.fromFunction0(value))
      
      inline def setGetHSLUndefined: Self = StObject.set(x, "getHSL", js.undefined)
      
      inline def setGetLighter(value: /* factor */ js.UndefOr[Double] => Any): Self = StObject.set(x, "getLighter", js.Any.fromFunction1(value))
      
      inline def setGetLighterUndefined: Self = StObject.set(x, "getLighter", js.undefined)
      
      inline def setGetRGB(value: () => Array): Self = StObject.set(x, "getRGB", js.Any.fromFunction0(value))
      
      inline def setGetRGBUndefined: Self = StObject.set(x, "getRGB", js.undefined)
      
      inline def setGetRed(value: () => Double): Self = StObject.set(x, "getRed", js.Any.fromFunction0(value))
      
      inline def setGetRedUndefined: Self = StObject.set(x, "getRed", js.undefined)
      
      inline def setLightnessFactor(value: Double): Self = StObject.set(x, "lightnessFactor", value.asInstanceOf[js.Any])
      
      inline def setLightnessFactorUndefined: Self = StObject.set(x, "lightnessFactor", js.undefined)
      
      inline def setToString_(value: () => java.lang.String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
      
      inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
    }
  }
  
  trait IComponent
    extends StObject
       with typings.extjs.Ext.IComponent {
    
    /** [Config Option] (Boolean) */
    var autoSize: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String[]) */
    var enginePriority: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (Object[]) */
    var gradients: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (Ext.draw.Sprite[]) */
    var items: js.UndefOr[Array] = js.undefined
    
    /** [Property] (Ext.draw.Surface) */
    var surface: js.UndefOr[ISurface] = js.undefined
    
    /** [Config Option] (Boolean) */
    var viewBox: js.UndefOr[Boolean] = js.undefined
  }
  object IComponent {
    
    inline def apply(): typings.extjs.Ext.draw.IComponent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.extjs.Ext.draw.IComponent]
    }
    
    extension [Self <: typings.extjs.Ext.draw.IComponent](x: Self) {
      
      inline def setAutoSize(value: Boolean): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      inline def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      inline def setEnginePriority(value: Array): Self = StObject.set(x, "enginePriority", value.asInstanceOf[js.Any])
      
      inline def setEnginePriorityUndefined: Self = StObject.set(x, "enginePriority", js.undefined)
      
      inline def setGradients(value: Array): Self = StObject.set(x, "gradients", value.asInstanceOf[js.Any])
      
      inline def setGradientsUndefined: Self = StObject.set(x, "gradients", js.undefined)
      
      inline def setItems(value: Array): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setSurface(value: ISurface): Self = StObject.set(x, "surface", value.asInstanceOf[js.Any])
      
      inline def setSurfaceUndefined: Self = StObject.set(x, "surface", js.undefined)
      
      inline def setViewBox(value: Boolean): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.extjs.Ext.IClass because Already inherited
  - typings.extjs.Ext.IBase because Already inherited
  - typings.extjs.Ext.util.IObservable because var conflicts: addEvents, addListener, addManagedListener, alias, alternateClassName, callOverridden, callParent, callSuper, clearListeners, clearManagedListeners, config, enableBubble, extend, fireEvent, fireEventArgs, getInitialConfig, hasListener, inheritableStatics, initConfig, mixins, mon, mun, on, relayEvents, removeListener, removeManagedListener, requires, resumeEvent, resumeEvents, self, singleton, statics, suspendEvent, suspendEvents, un, uses. Inlined listeners, hasListeners, isObservable
  - typings.extjs.Ext.util.ISortable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, generateComparator, getFirstSorter, getInitialConfig, inheritableStatics, initConfig, initSortable, mixins, requires, self, singleton, sort, statics, uses. Inlined defaultSortDirection, sortRoot, sorters, isSortable
  - typings.extjs.Ext.util.IAbstractMixedCollection because var conflicts: alias, allowFunctions, alternateClassName, callOverridden, callParent, callSuper, clone, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined isMixedCollection, add, addAll, addEvents, addListener, addManagedListener, clear, clearListeners, clearManagedListeners, collect, contains, containsKey, each, eachKey, enableBubble, filter, filterBy, find, findBy, findIndex, findIndexBy, fireEvent, fireEventArgs, first, get, getAt, getByKey, getCount, getKey, getRange, hasListener, indexOf, indexOfKey, insert, last, mon, mun, on, relayEvents, remove, removeAll, removeAt, removeAtKey, removeListener, removeManagedListener, removeRange, replace, resumeEvent, resumeEvents, sum, suspendEvent, suspendEvents, un, updateKey
  - typings.extjs.Ext.util.IMixedCollection because var conflicts: clone. Inlined allowFunctions, findInsertionIndex, generateComparator, getFirstSorter, initSortable, reorder, sort, sortBy, sortByKey */ trait ICompositeSprite
    extends StObject
       with IAnimate {
    
    /** [Method] Inherit docs from MixedCollection
      * @param key Object
      * @param o Object
      * @returns Object The item added.
      */
    var add: js.UndefOr[js.Function2[js.UndefOr[Any], js.UndefOr[Any], Any]] = js.undefined
    
    /** [Method] Adds all elements of an Array or an Object to the collection
      * @param objs Object/Array An Object containing properties which will be added to the collection, or an Array of values, each of which are added to the collection. Functions references will be added to the collection if allowFunctions has been set to true.
      */
    var addAll: js.UndefOr[js.Function1[/* objs */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Adds class to all sprites
      * @param cls String CSS class name
      */
    var addCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Adds the specified events to the list of events which this Observable may fire
      * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
      */
    var addEvents: js.UndefOr[js.Function1[/* eventNames */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Appends an event handler to this object
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    var addListener: js.UndefOr[
        js.Function4[
          /* eventName */ js.UndefOr[Any], 
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          /* options */ js.UndefOr[Any], 
          Any
        ]
      ] = js.undefined
    
    /** [Method] Adds listeners to any Observable object or Ext Element which are automatically removed when this Component is destr
      * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      * @param options Object If the ename parameter was an event name, this is the addListener options.
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    var addManagedListener: js.UndefOr[
        js.Function5[
          /* item */ js.UndefOr[Any], 
          /* ename */ js.UndefOr[Any], 
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          /* options */ js.UndefOr[Any], 
          Any
        ]
      ] = js.undefined
    
    /** [Config Option] (Boolean) */
    var allowFunctions: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Performs custom animation on this object
      * @param config Object Configuration for Ext.fx.Anim. Note that the to config is required.
      * @returns Object this
      */
    @JSName("animate")
    var animate_ICompositeSprite: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Any]] = js.undefined
    
    /** [Method] Removes all items from the collection  */
    var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Removes all listeners for this object including the managed listeners */
    var clearListeners: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Removes all managed listeners for this object  */
    var clearManagedListeners: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Collects unique values of a particular property in this MixedCollection
      * @param property String The property to collect on
      * @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
      * @param allowBlank Boolean Pass true to allow null, undefined or empty string values
      * @returns Array The unique values
      */
    var collect: js.UndefOr[
        js.Function3[
          /* property */ js.UndefOr[java.lang.String], 
          /* root */ js.UndefOr[java.lang.String], 
          /* allowBlank */ js.UndefOr[Boolean], 
          Array
        ]
      ] = js.undefined
    
    /** [Method] Returns true if the collection contains the passed Object as an item
      * @param o Object The Object to look for in the collection.
      * @returns Boolean True if the collection contains the Object as an item.
      */
    var contains: js.UndefOr[js.Function1[/* o */ js.UndefOr[Any], Boolean]] = js.undefined
    
    /** [Method] Returns true if the collection contains the passed Object as a key
      * @param key String The key to look for in the collection.
      * @returns Boolean True if the collection contains the Object as a key.
      */
    var containsKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
    
    /** [Config Option] (String) */
    var defaultSortDirection: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Destroys this CompositeSprite  */
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Executes the specified function once for every item in the collection
      * @param fn Function The function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the current item in the iteration.
      */
    var each: js.UndefOr[js.Function2[/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Executes the specified function once for every key in the collection passing each key and its associated item as th
      * @param fn Function The function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
      */
    var eachKey: js.UndefOr[js.Function2[/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
      * @param eventNames String/String[] The event name to bubble, or an Array of event names.
      */
    var enableBubble: js.UndefOr[js.Function1[/* eventNames */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Filters the objects in this collection by a set of Filters or by a single property value pair with optional paramete
      * @param property Ext.util.Filter[]/String A property on your objects, or an array of Filter objects
      * @param value String/RegExp Either string that the property values should start with or a RegExp to test against the property
      * @param anyMatch Boolean True to match any part of the string, not just the beginning
      * @param caseSensitive Boolean True for case sensitive comparison.
      * @returns Ext.util.MixedCollection The new filtered collection
      */
    var filter: js.UndefOr[
        js.Function4[
          /* property */ js.UndefOr[Any], 
          /* value */ js.UndefOr[Any], 
          /* anyMatch */ js.UndefOr[Boolean], 
          /* caseSensitive */ js.UndefOr[Boolean], 
          IMixedCollection
        ]
      ] = js.undefined
    
    /** [Method] Filter by a function
      * @param fn Function The function to be called.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
      * @returns Ext.util.MixedCollection The new filtered collection
      */
    var filterBy: js.UndefOr[
        js.Function2[/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], IMixedCollection]
      ] = js.undefined
    
    /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function  */
    var find: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Returns the first item in the collection which elicits a true return value from the passed selection function
      * @param fn Function The selection function to execute for each item.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to the browser window.
      * @returns Object The first item in the collection which returned true from the selection function, or null if none was found.
      */
    var findBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], Any]] = js.undefined
    
    /** [Method] Finds the index of the first matching object in this collection by a specific property value
      * @param property String The name of a property on your objects.
      * @param value String/RegExp A string that the property values should start with or a RegExp to test against the property.
      * @param start Number The index to start searching at.
      * @param anyMatch Boolean True to match any part of the string, not just the beginning.
      * @param caseSensitive Boolean True for case sensitive comparison.
      * @returns Number The matched index or -1
      */
    var findIndex: js.UndefOr[
        js.Function5[
          /* property */ js.UndefOr[java.lang.String], 
          /* value */ js.UndefOr[Any], 
          /* start */ js.UndefOr[Double], 
          /* anyMatch */ js.UndefOr[Boolean], 
          /* caseSensitive */ js.UndefOr[Boolean], 
          Double
        ]
      ] = js.undefined
    
    /** [Method] Find the index of the first matching object in this collection by a function
      * @param fn Function The function to be called.
      * @param scope Object The scope (this reference) in which the function is executed. Defaults to this MixedCollection.
      * @param start Number The index to start searching at.
      * @returns Number The matched index or -1
      */
    var findIndexBy: js.UndefOr[
        js.Function3[
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          /* start */ js.UndefOr[Double], 
          Double
        ]
      ] = js.undefined
    
    /** [Method] Calculates the insertion index of the new item based upon the comparison function passed or the current sort order
      * @param newItem Object The new object to find the insertion position of.
      * @param sorterFn Function The function to sort by. This is the same as the sorting function passed to sortBy. It accepts 2 items from this MixedCollection, and returns -1 0, or 1 depending on the relative sort positions of the 2 compared items. If omitted, a function generated from the currently defined set of sorters will be used.
      * @returns Number The insertion point to add the new item into this MixedCollection at using insert
      */
    var findInsertionIndex: js.UndefOr[
        js.Function2[/* newItem */ js.UndefOr[Any], /* sorterFn */ js.UndefOr[Any], Double]
      ] = js.undefined
    
    /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
      * @param eventName String The name of the event to fire.
      * @param args Object... Variable number of parameters are passed to handlers.
      * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
      */
    var fireEvent: js.UndefOr[js.Function2[/* eventName */ java.lang.String, /* repeated */ Any, Boolean]] = js.undefined
    
    /** [Method] Fires the specified event with the passed parameter list
      * @param eventName String The name of the event to fire.
      * @param args Object[] An array of parameters which are passed to handlers.
      * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
      */
    var fireEventArgs: js.UndefOr[
        js.Function2[/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array], Boolean]
      ] = js.undefined
    
    /** [Method] Returns the first item in the collection
      * @returns Object the first item in the collection..
      */
    var first: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns a comparator function which compares two items and returns 1 0 or 1 depending on the currently defined set  */
    var generateComparator: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Returns the item associated with the passed key OR index
      * @param key String/Number The key or index of the item.
      * @returns Object If the item is found, returns the item. If the item was not found, returns undefined. If an item was found, but is a Class, returns null.
      */
    var get: js.UndefOr[js.Function1[/* key */ js.UndefOr[Any], Any]] = js.undefined
    
    /** [Method] Returns the item at the specified index
      * @param index Number The index of the item.
      * @returns Object The item at the specified index.
      */
    var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Any]] = js.undefined
    
    /** [Method] Returns the group bounding box
      * @returns Object an object with x, y, width, and height properties.
      */
    var getBBox: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the item associated with the passed key
      * @param key String/Number The key of the item.
      * @returns Object The item associated with the passed key.
      */
    var getByKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[Any], Any]] = js.undefined
    
    /** [Method] Returns the number of items in the collection
      * @returns Number the number of items in the collection.
      */
    var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Gets the first sorter from the sorters collection excluding any groupers that may be in place
      * @returns Ext.util.Sorter The sorter, null if none exist
      */
    var getFirstSorter: js.UndefOr[js.Function0[ISorter]] = js.undefined
    
    /** [Method] A function which will be called passing a newly added object when the object is added without a separate id
      * @param item Object The item for which to find the key.
      * @returns Object The key for the passed item.
      */
    var getKey: js.UndefOr[js.Function1[/* item */ js.UndefOr[Any], Any]] = js.undefined
    
    /** [Method] Returns a range of items in this collection
      * @param startIndex Number The starting index. Defaults to 0.
      * @param endIndex Number The ending index. Defaults to the last item.
      * @returns Array An array of items
      */
    var getRange: js.UndefOr[
        js.Function2[/* startIndex */ js.UndefOr[Double], /* endIndex */ js.UndefOr[Double], Array]
      ] = js.undefined
    
    /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
      * @param eventName String The name of the event to check for
      * @returns Boolean true if the event is being listened for or bubbles, else false
      */
    var hasListener: js.UndefOr[js.Function1[/* eventName */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
    
    /** [Property] (Object) */
    var hasListeners: js.UndefOr[Any] = js.undefined
    
    /** [Method] Hides all sprites
      * @param redraw Boolean Flag to immediately draw the change.
      * @returns Ext.draw.CompositeSprite this
      */
    var hide: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[Boolean], this.type]] = js.undefined
    
    /** [Method] Returns index within the collection of the passed Object
      * @param o Object The item to find the index of.
      * @returns Number index of the item. Returns -1 if not found.
      */
    var indexOf: js.UndefOr[js.Function1[/* o */ js.UndefOr[Any], Double]] = js.undefined
    
    /** [Method] Returns index within the collection of the passed key
      * @param key String The key to find the index of.
      * @returns Number index of the key.
      */
    var indexOfKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[java.lang.String], Double]] = js.undefined
    
    /** [Method] Performs initialization of this mixin  */
    var initSortable: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Inserts an item at the specified index in the collection
      * @param index Object
      * @param key Object
      * @param o Object
      * @returns Object The item inserted or an array of items inserted.
      */
    var insert: js.UndefOr[js.Function3[js.UndefOr[Any | Double], js.UndefOr[Any], js.UndefOr[Any], Any]] = js.undefined
    
    /** [Property] (Boolean) */
    var isMixedCollection: js.UndefOr[Boolean] = js.undefined
    
    /** [Property] (Boolean) */
    var isObservable: js.UndefOr[Boolean] = js.undefined
    
    /** [Property] (Boolean) */
    var isSortable: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Returns the last item in the collection
      * @returns Object the last item in the collection..
      */
    var last: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Config Option] (Object) */
    var listeners: js.UndefOr[Any] = js.undefined
    
    /** [Method] Shorthand for addManagedListener
      * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      * @param options Object If the ename parameter was an event name, this is the addListener options.
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    var mon: js.UndefOr[
        js.Function5[
          /* item */ js.UndefOr[Any], 
          /* ename */ js.UndefOr[Any], 
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          /* options */ js.UndefOr[Any], 
          Any
        ]
      ] = js.undefined
    
    /** [Method] Shorthand for removeManagedListener
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    var mun: js.UndefOr[
        js.Function4[
          /* item */ js.UndefOr[Any], 
          /* ename */ js.UndefOr[Any], 
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Shorthand for addListener
      * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
      * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
      * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
      * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
      * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
      */
    var on: js.UndefOr[
        js.Function4[
          /* eventName */ js.UndefOr[Any], 
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          /* options */ js.UndefOr[Any], 
          Any
        ]
      ] = js.undefined
    
    /** [Method] Force redraw of all sprites  */
    var redraw: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param origin Object The Observable whose events this object is to relay.
      * @param events String[] Array of event names to relay.
      * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
      * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
      */
    var relayEvents: js.UndefOr[
        js.Function3[
          /* origin */ js.UndefOr[Any], 
          /* events */ js.UndefOr[Array], 
          /* prefix */ js.UndefOr[java.lang.String], 
          Any
        ]
      ] = js.undefined
    
    /** [Method] Inherit docs from MixedCollection
      * @param o Object
      * @returns Object The item removed or false if no item was removed.
      */
    var remove: js.UndefOr[js.Function1[js.UndefOr[Any], Any]] = js.undefined
    
    /** [Method] Remove all items in the collection
      * @param items Array An array of items to be removed.
      * @returns Ext.util.MixedCollection this object
      */
    var removeAll: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], IMixedCollection]] = js.undefined
    
    /** [Method] Remove an item from a specified index in the collection
      * @param index Number The index within the collection of the item to remove.
      * @returns Object The item removed or false if no item was removed.
      */
    var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Any]] = js.undefined
    
    /** [Method] Removes an item associated with the passed key fom the collection
      * @param key String The key of the item to remove. If null is passed, all objects which yielded no key from the configured getKey function are removed.
      * @returns Object Only returned if removing at a specified key. The item removed or false if no item was removed.
      */
    var removeAtKey: js.UndefOr[js.Function1[/* key */ js.UndefOr[java.lang.String], Any]] = js.undefined
    
    /** [Method] Removes class from all sprites
      * @param cls String CSS class name
      */
    var removeCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Removes an event handler
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    var removeListener: js.UndefOr[
        js.Function3[
          /* eventName */ js.UndefOr[java.lang.String], 
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Removes listeners that were added by the mon method
      * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
      * @param ename Object/String The event name, or an object containing event name properties.
      * @param fn Function If the ename parameter was an event name, this is the handler function.
      * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
      */
    var removeManagedListener: js.UndefOr[
        js.Function4[
          /* item */ js.UndefOr[Any], 
          /* ename */ js.UndefOr[Any], 
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Remove a range of items starting at a specified index in the collection
      * @param index Number The index within the collection of the item to remove.
      * @param removeCount Number The nuber of items to remove beginning at the specified index.
      * @returns Object The last item removed or false if no item was removed.
      */
    var removeRange: js.UndefOr[
        js.Function2[/* index */ js.UndefOr[Double], /* removeCount */ js.UndefOr[Double], Any]
      ] = js.undefined
    
    /** [Method] Reorders each of the items based on a mapping from old index to new index
      * @param mapping Object Mapping from old item index to new item index
      */
    var reorder: js.UndefOr[js.Function1[/* mapping */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Replaces an item in the collection
      * @param key String The key associated with the item to replace, or the replacement item. If you supplied a getKey implementation for this MixedCollection, or if the key of your stored items is in a property called id, then the MixedCollection will be able to derive the key of the replacement item. If you want to replace an item with one having the same key value, then just pass the replacement item in this parameter.
      * @param o Object {Object} o (optional) If the first parameter passed was a key, the item to associate with that key.
      * @returns Object The new item.
      */
    var replace: js.UndefOr[
        js.Function2[/* key */ js.UndefOr[java.lang.String], /* o */ js.UndefOr[Any], Any]
      ] = js.undefined
    
    /** [Method] Resumes firing of the named event s
      * @param eventName String... Multiple event names to resume.
      */
    var resumeEvent: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    /** [Method] Resumes firing events see suspendEvents */
    var resumeEvents: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Iterates through all sprites calling setAttributes on each one
      * @param attrs Object Attributes to be changed on the sprite.
      * @param redraw Boolean Flag to immediately draw the change.
      * @returns Ext.draw.CompositeSprite this
      */
    var setAttributes: js.UndefOr[
        js.Function2[/* attrs */ js.UndefOr[Any], /* redraw */ js.UndefOr[Boolean], this.type]
      ] = js.undefined
    
    /** [Method] Sets style for all sprites
      * @param style String CSS Style definition.
      */
    var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Shows all sprites
      * @param redraw Boolean Flag to immediately draw the change.
      * @returns Ext.draw.CompositeSprite this
      */
    var show: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[Boolean], this.type]] = js.undefined
    
    /** [Method] Sorts the data in the Store by one or more of its properties
      * @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
      * @param direction String The overall direction to sort the data by.
      * @returns Ext.util.Sorter[]
      */
    var sort: js.UndefOr[
        js.Function2[/* sorters */ js.UndefOr[Any], /* direction */ js.UndefOr[java.lang.String], Array]
      ] = js.undefined
    
    /** [Method] Sorts the collection by a single sorter function
      * @param sorterFn Function The function to sort by
      */
    var sortBy: js.UndefOr[js.Function1[/* sorterFn */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sorts this collection by keys
      * @param direction String 'ASC' or 'DESC'. Defaults to 'ASC'.
      * @param fn Function Comparison function that defines the sort order. Defaults to sorting by case insensitive string.
      */
    var sortByKey: js.UndefOr[
        js.Function2[/* direction */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[Any], Unit]
      ] = js.undefined
    
    /** [Config Option] (String) */
    var sortRoot: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Ext.util.Sorter[]/Object[]) */
    var sorters: js.UndefOr[Any] = js.undefined
    
    /** [Method] Collects all of the values of the given property and returns their sum
      * @param property String The property to sum by
      * @param root String 'root' property to extract the first argument from. This is used mainly when summing fields in records, where the fields are all stored inside the 'data' object
      * @param start Number The record index to start at
      * @param end Number The record index to end at
      * @returns Number The total
      */
    var sum: js.UndefOr[
        js.Function4[
          /* property */ js.UndefOr[java.lang.String], 
          /* root */ js.UndefOr[java.lang.String], 
          /* start */ js.UndefOr[Double], 
          /* end */ js.UndefOr[Double], 
          Double
        ]
      ] = js.undefined
    
    /** [Method] Suspends firing of the named event s
      * @param eventName String... Multiple event names to suspend.
      */
    var suspendEvent: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    /** [Method] Suspends the firing of all events
      * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
      */
    var suspendEvents: js.UndefOr[js.Function1[/* queueSuspended */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Shorthand for removeListener
      * @param eventName String The type of event the handler was associated with.
      * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
      * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
      */
    var un: js.UndefOr[
        js.Function3[
          /* eventName */ js.UndefOr[java.lang.String], 
          /* fn */ js.UndefOr[Any], 
          /* scope */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Change the key for an existing item in the collection
      * @param oldKey Object The old key
      * @param newKey Object The new key
      */
    var updateKey: js.UndefOr[js.Function2[/* oldKey */ js.UndefOr[Any], /* newKey */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object ICompositeSprite {
    
    inline def apply(): ICompositeSprite = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICompositeSprite]
    }
    
    extension [Self <: ICompositeSprite](x: Self) {
      
      inline def setAdd(value: (js.UndefOr[Any], js.UndefOr[Any]) => Any): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setAddAll(value: /* objs */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "addAll", js.Any.fromFunction1(value))
      
      inline def setAddAllUndefined: Self = StObject.set(x, "addAll", js.undefined)
      
      inline def setAddCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "addCls", js.Any.fromFunction1(value))
      
      inline def setAddClsUndefined: Self = StObject.set(x, "addCls", js.undefined)
      
      inline def setAddEvents(value: /* eventNames */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "addEvents", js.Any.fromFunction1(value))
      
      inline def setAddEventsUndefined: Self = StObject.set(x, "addEvents", js.undefined)
      
      inline def setAddListener(
        value: (/* eventName */ js.UndefOr[Any], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* options */ js.UndefOr[Any]) => Any
      ): Self = StObject.set(x, "addListener", js.Any.fromFunction4(value))
      
      inline def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
      
      inline def setAddManagedListener(
        value: (/* item */ js.UndefOr[Any], /* ename */ js.UndefOr[Any], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* options */ js.UndefOr[Any]) => Any
      ): Self = StObject.set(x, "addManagedListener", js.Any.fromFunction5(value))
      
      inline def setAddManagedListenerUndefined: Self = StObject.set(x, "addManagedListener", js.undefined)
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setAllowFunctions(value: Boolean): Self = StObject.set(x, "allowFunctions", value.asInstanceOf[js.Any])
      
      inline def setAllowFunctionsUndefined: Self = StObject.set(x, "allowFunctions", js.undefined)
      
      inline def setAnimate(value: /* config */ js.UndefOr[Any] => Any): Self = StObject.set(x, "animate", js.Any.fromFunction1(value))
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setClearListeners(value: () => Unit): Self = StObject.set(x, "clearListeners", js.Any.fromFunction0(value))
      
      inline def setClearListenersUndefined: Self = StObject.set(x, "clearListeners", js.undefined)
      
      inline def setClearManagedListeners(value: () => Unit): Self = StObject.set(x, "clearManagedListeners", js.Any.fromFunction0(value))
      
      inline def setClearManagedListenersUndefined: Self = StObject.set(x, "clearManagedListeners", js.undefined)
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setCollect(
        value: (/* property */ js.UndefOr[java.lang.String], /* root */ js.UndefOr[java.lang.String], /* allowBlank */ js.UndefOr[Boolean]) => Array
      ): Self = StObject.set(x, "collect", js.Any.fromFunction3(value))
      
      inline def setCollectUndefined: Self = StObject.set(x, "collect", js.undefined)
      
      inline def setContains(value: /* o */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setContainsKey(value: /* key */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "containsKey", js.Any.fromFunction1(value))
      
      inline def setContainsKeyUndefined: Self = StObject.set(x, "containsKey", js.undefined)
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setDefaultSortDirection(value: java.lang.String): Self = StObject.set(x, "defaultSortDirection", value.asInstanceOf[js.Any])
      
      inline def setDefaultSortDirectionUndefined: Self = StObject.set(x, "defaultSortDirection", js.undefined)
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEach(value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "each", js.Any.fromFunction2(value))
      
      inline def setEachKey(value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "eachKey", js.Any.fromFunction2(value))
      
      inline def setEachKeyUndefined: Self = StObject.set(x, "eachKey", js.undefined)
      
      inline def setEachUndefined: Self = StObject.set(x, "each", js.undefined)
      
      inline def setEnableBubble(value: /* eventNames */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "enableBubble", js.Any.fromFunction1(value))
      
      inline def setEnableBubbleUndefined: Self = StObject.set(x, "enableBubble", js.undefined)
      
      inline def setFilter(
        value: (/* property */ js.UndefOr[Any], /* value */ js.UndefOr[Any], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => IMixedCollection
      ): Self = StObject.set(x, "filter", js.Any.fromFunction4(value))
      
      inline def setFilterBy(value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => IMixedCollection): Self = StObject.set(x, "filterBy", js.Any.fromFunction2(value))
      
      inline def setFilterByUndefined: Self = StObject.set(x, "filterBy", js.undefined)
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFind(value: () => Unit): Self = StObject.set(x, "find", js.Any.fromFunction0(value))
      
      inline def setFindBy(value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "findBy", js.Any.fromFunction2(value))
      
      inline def setFindByUndefined: Self = StObject.set(x, "findBy", js.undefined)
      
      inline def setFindIndex(
        value: (/* property */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[Any], /* start */ js.UndefOr[Double], /* anyMatch */ js.UndefOr[Boolean], /* caseSensitive */ js.UndefOr[Boolean]) => Double
      ): Self = StObject.set(x, "findIndex", js.Any.fromFunction5(value))
      
      inline def setFindIndexBy(
        value: (/* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* start */ js.UndefOr[Double]) => Double
      ): Self = StObject.set(x, "findIndexBy", js.Any.fromFunction3(value))
      
      inline def setFindIndexByUndefined: Self = StObject.set(x, "findIndexBy", js.undefined)
      
      inline def setFindIndexUndefined: Self = StObject.set(x, "findIndex", js.undefined)
      
      inline def setFindInsertionIndex(value: (/* newItem */ js.UndefOr[Any], /* sorterFn */ js.UndefOr[Any]) => Double): Self = StObject.set(x, "findInsertionIndex", js.Any.fromFunction2(value))
      
      inline def setFindInsertionIndexUndefined: Self = StObject.set(x, "findInsertionIndex", js.undefined)
      
      inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
      
      inline def setFireEvent(value: (/* eventName */ java.lang.String, /* repeated */ Any) => Boolean): Self = StObject.set(x, "fireEvent", js.Any.fromFunction2(value))
      
      inline def setFireEventArgs(value: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array]) => Boolean): Self = StObject.set(x, "fireEventArgs", js.Any.fromFunction2(value))
      
      inline def setFireEventArgsUndefined: Self = StObject.set(x, "fireEventArgs", js.undefined)
      
      inline def setFireEventUndefined: Self = StObject.set(x, "fireEvent", js.undefined)
      
      inline def setFirst(value: () => Any): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setGenerateComparator(value: () => Unit): Self = StObject.set(x, "generateComparator", js.Any.fromFunction0(value))
      
      inline def setGenerateComparatorUndefined: Self = StObject.set(x, "generateComparator", js.undefined)
      
      inline def setGet(value: /* key */ js.UndefOr[Any] => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetAt(value: /* index */ js.UndefOr[Double] => Any): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetAtUndefined: Self = StObject.set(x, "getAt", js.undefined)
      
      inline def setGetBBox(value: () => Any): Self = StObject.set(x, "getBBox", js.Any.fromFunction0(value))
      
      inline def setGetBBoxUndefined: Self = StObject.set(x, "getBBox", js.undefined)
      
      inline def setGetByKey(value: /* key */ js.UndefOr[Any] => Any): Self = StObject.set(x, "getByKey", js.Any.fromFunction1(value))
      
      inline def setGetByKeyUndefined: Self = StObject.set(x, "getByKey", js.undefined)
      
      inline def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
      
      inline def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
      
      inline def setGetFirstSorter(value: () => ISorter): Self = StObject.set(x, "getFirstSorter", js.Any.fromFunction0(value))
      
      inline def setGetFirstSorterUndefined: Self = StObject.set(x, "getFirstSorter", js.undefined)
      
      inline def setGetKey(value: /* item */ js.UndefOr[Any] => Any): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
      
      inline def setGetKeyUndefined: Self = StObject.set(x, "getKey", js.undefined)
      
      inline def setGetRange(value: (/* startIndex */ js.UndefOr[Double], /* endIndex */ js.UndefOr[Double]) => Array): Self = StObject.set(x, "getRange", js.Any.fromFunction2(value))
      
      inline def setGetRangeUndefined: Self = StObject.set(x, "getRange", js.undefined)
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setHasListener(value: /* eventName */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      inline def setHasListenerUndefined: Self = StObject.set(x, "hasListener", js.undefined)
      
      inline def setHasListeners(value: Any): Self = StObject.set(x, "hasListeners", value.asInstanceOf[js.Any])
      
      inline def setHasListenersUndefined: Self = StObject.set(x, "hasListeners", js.undefined)
      
      inline def setHide(value: /* redraw */ js.UndefOr[Boolean] => ICompositeSprite): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setIndexOf(value: /* o */ js.UndefOr[Any] => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      inline def setIndexOfKey(value: /* key */ js.UndefOr[java.lang.String] => Double): Self = StObject.set(x, "indexOfKey", js.Any.fromFunction1(value))
      
      inline def setIndexOfKeyUndefined: Self = StObject.set(x, "indexOfKey", js.undefined)
      
      inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
      
      inline def setInitSortable(value: () => Unit): Self = StObject.set(x, "initSortable", js.Any.fromFunction0(value))
      
      inline def setInitSortableUndefined: Self = StObject.set(x, "initSortable", js.undefined)
      
      inline def setInsert(value: (js.UndefOr[Any | Double], js.UndefOr[Any], js.UndefOr[Any]) => Any): Self = StObject.set(x, "insert", js.Any.fromFunction3(value))
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setIsMixedCollection(value: Boolean): Self = StObject.set(x, "isMixedCollection", value.asInstanceOf[js.Any])
      
      inline def setIsMixedCollectionUndefined: Self = StObject.set(x, "isMixedCollection", js.undefined)
      
      inline def setIsObservable(value: Boolean): Self = StObject.set(x, "isObservable", value.asInstanceOf[js.Any])
      
      inline def setIsObservableUndefined: Self = StObject.set(x, "isObservable", js.undefined)
      
      inline def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
      
      inline def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
      
      inline def setLast(value: () => Any): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
      
      inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      inline def setListeners(value: Any): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      inline def setMon(
        value: (/* item */ js.UndefOr[Any], /* ename */ js.UndefOr[Any], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* options */ js.UndefOr[Any]) => Any
      ): Self = StObject.set(x, "mon", js.Any.fromFunction5(value))
      
      inline def setMonUndefined: Self = StObject.set(x, "mon", js.undefined)
      
      inline def setMun(
        value: (/* item */ js.UndefOr[Any], /* ename */ js.UndefOr[Any], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "mun", js.Any.fromFunction4(value))
      
      inline def setMunUndefined: Self = StObject.set(x, "mun", js.undefined)
      
      inline def setOn(
        value: (/* eventName */ js.UndefOr[Any], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any], /* options */ js.UndefOr[Any]) => Any
      ): Self = StObject.set(x, "on", js.Any.fromFunction4(value))
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setRedraw(value: () => Unit): Self = StObject.set(x, "redraw", js.Any.fromFunction0(value))
      
      inline def setRedrawUndefined: Self = StObject.set(x, "redraw", js.undefined)
      
      inline def setRelayEvents(
        value: (/* origin */ js.UndefOr[Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[java.lang.String]) => Any
      ): Self = StObject.set(x, "relayEvents", js.Any.fromFunction3(value))
      
      inline def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      inline def setRemove(value: js.UndefOr[Any] => Any): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveAll(value: /* items */ js.UndefOr[Array] => IMixedCollection): Self = StObject.set(x, "removeAll", js.Any.fromFunction1(value))
      
      inline def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
      
      inline def setRemoveAt(value: /* index */ js.UndefOr[Double] => Any): Self = StObject.set(x, "removeAt", js.Any.fromFunction1(value))
      
      inline def setRemoveAtKey(value: /* key */ js.UndefOr[java.lang.String] => Any): Self = StObject.set(x, "removeAtKey", js.Any.fromFunction1(value))
      
      inline def setRemoveAtKeyUndefined: Self = StObject.set(x, "removeAtKey", js.undefined)
      
      inline def setRemoveAtUndefined: Self = StObject.set(x, "removeAt", js.undefined)
      
      inline def setRemoveCls(value: /* cls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "removeCls", js.Any.fromFunction1(value))
      
      inline def setRemoveClsUndefined: Self = StObject.set(x, "removeCls", js.undefined)
      
      inline def setRemoveListener(
        value: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "removeListener", js.Any.fromFunction3(value))
      
      inline def setRemoveListenerUndefined: Self = StObject.set(x, "removeListener", js.undefined)
      
      inline def setRemoveManagedListener(
        value: (/* item */ js.UndefOr[Any], /* ename */ js.UndefOr[Any], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "removeManagedListener", js.Any.fromFunction4(value))
      
      inline def setRemoveManagedListenerUndefined: Self = StObject.set(x, "removeManagedListener", js.undefined)
      
      inline def setRemoveRange(value: (/* index */ js.UndefOr[Double], /* removeCount */ js.UndefOr[Double]) => Any): Self = StObject.set(x, "removeRange", js.Any.fromFunction2(value))
      
      inline def setRemoveRangeUndefined: Self = StObject.set(x, "removeRange", js.undefined)
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setReorder(value: /* mapping */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "reorder", js.Any.fromFunction1(value))
      
      inline def setReorderUndefined: Self = StObject.set(x, "reorder", js.undefined)
      
      inline def setReplace(value: (/* key */ js.UndefOr[java.lang.String], /* o */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setResumeEvent(value: /* repeated */ Any => Unit): Self = StObject.set(x, "resumeEvent", js.Any.fromFunction1(value))
      
      inline def setResumeEventUndefined: Self = StObject.set(x, "resumeEvent", js.undefined)
      
      inline def setResumeEvents(value: () => Unit): Self = StObject.set(x, "resumeEvents", js.Any.fromFunction0(value))
      
      inline def setResumeEventsUndefined: Self = StObject.set(x, "resumeEvents", js.undefined)
      
      inline def setSetAttributes(value: (/* attrs */ js.UndefOr[Any], /* redraw */ js.UndefOr[Boolean]) => ICompositeSprite): Self = StObject.set(x, "setAttributes", js.Any.fromFunction2(value))
      
      inline def setSetAttributesUndefined: Self = StObject.set(x, "setAttributes", js.undefined)
      
      inline def setSetStyle(value: /* style */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction1(value))
      
      inline def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
      
      inline def setShow(value: /* redraw */ js.UndefOr[Boolean] => ICompositeSprite): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSort(value: (/* sorters */ js.UndefOr[Any], /* direction */ js.UndefOr[java.lang.String]) => Array): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      inline def setSortBy(value: /* sorterFn */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "sortBy", js.Any.fromFunction1(value))
      
      inline def setSortByKey(value: (/* direction */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "sortByKey", js.Any.fromFunction2(value))
      
      inline def setSortByKeyUndefined: Self = StObject.set(x, "sortByKey", js.undefined)
      
      inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
      
      inline def setSortRoot(value: java.lang.String): Self = StObject.set(x, "sortRoot", value.asInstanceOf[js.Any])
      
      inline def setSortRootUndefined: Self = StObject.set(x, "sortRoot", js.undefined)
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSorters(value: Any): Self = StObject.set(x, "sorters", value.asInstanceOf[js.Any])
      
      inline def setSortersUndefined: Self = StObject.set(x, "sorters", js.undefined)
      
      inline def setSum(
        value: (/* property */ js.UndefOr[java.lang.String], /* root */ js.UndefOr[java.lang.String], /* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Double
      ): Self = StObject.set(x, "sum", js.Any.fromFunction4(value))
      
      inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
      
      inline def setSuspendEvent(value: /* repeated */ Any => Unit): Self = StObject.set(x, "suspendEvent", js.Any.fromFunction1(value))
      
      inline def setSuspendEventUndefined: Self = StObject.set(x, "suspendEvent", js.undefined)
      
      inline def setSuspendEvents(value: /* queueSuspended */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "suspendEvents", js.Any.fromFunction1(value))
      
      inline def setSuspendEventsUndefined: Self = StObject.set(x, "suspendEvents", js.undefined)
      
      inline def setUn(
        value: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[Any], /* scope */ js.UndefOr[Any]) => Unit
      ): Self = StObject.set(x, "un", js.Any.fromFunction3(value))
      
      inline def setUnUndefined: Self = StObject.set(x, "un", js.undefined)
      
      inline def setUpdateKey(value: (/* oldKey */ js.UndefOr[Any], /* newKey */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "updateKey", js.Any.fromFunction2(value))
      
      inline def setUpdateKeyUndefined: Self = StObject.set(x, "updateKey", js.undefined)
    }
  }
  
  type IDraw = IBase
  
  type IMatrix = IBase
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.extjs.Ext.IClass because Already inherited
  - typings.extjs.Ext.IBase because Already inherited
  - typings.extjs.Ext.util.IAnimate because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined animate, getActiveAnimation, hasActiveFx, sequenceFx, stopAnimation, stopFx, syncFx */ trait ISprite
    extends StObject
       with IObservable {
    
    /** [Method] Adds one or more CSS classes to the element
      * @param className String/String[] The CSS class to add, or an array of classes
      * @returns Ext.draw.Sprite this
      */
    var addCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Performs custom animation on this object
      * @param config Object Configuration for Ext.fx.Anim. Note that the to config is required.
      * @returns Object this
      */
    var animate: js.UndefOr[Any | (js.Function1[/* config */ js.UndefOr[Any], Any])] = js.undefined
    
    /** [Property] (Ext.dd.DragSource) */
    var dd: js.UndefOr[IDragSource] = js.undefined
    
    /** [Method] Removes the sprite and clears all listeners  */
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String) */
    var fill: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var font: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
      * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
      */
    var getActiveAnimation: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Retrieves the bounding box of the sprite
      * @returns Object bbox
      */
    var getBBox: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Config Option] (String/String[]) */
    var group: js.UndefOr[Any] = js.undefined
    
    /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
      * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
      */
    var hasActiveFx: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Config Option] (Number) */
    var height: js.UndefOr[Double] = js.undefined
    
    /** [Method] Hides the sprite
      * @param redraw Boolean Flag to immediately draw the change.
      * @returns Ext.draw.Sprite this
      */
    var hide: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[Boolean], this.type]] = js.undefined
    
    /** [Property] (Boolean) */
    var isSprite: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number) */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String) */
    var path: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Number) */
    var radius: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var radiusX: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var radiusY: js.UndefOr[Double] = js.undefined
    
    /** [Method] Redraws the sprite
      * @returns Ext.draw.Sprite this
      */
    var redraw: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Method] Removes the sprite
      * @returns Boolean True if sprite was successfully removed. False when there was no surface to remove it from.
      */
    var remove: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Removes one or more CSS classes from the element
      * @param className String/String[] The CSS class to remove, or an array of classes. Note this method is severly limited in VML.
      * @returns Ext.draw.Sprite this
      */
    var removeCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
      * @returns Object this
      */
    var sequenceFx: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Change the attributes of the sprite
      * @param attrs Object attributes to be changed on the sprite.
      * @param redraw Boolean Flag to immediately draw the change.
      * @returns Ext.draw.Sprite this
      */
    var setAttributes: js.UndefOr[
        js.Function2[/* attrs */ js.UndefOr[Any], /* redraw */ js.UndefOr[Boolean], this.type]
      ] = js.undefined
    
    /** [Method] Wrapper for setting style properties also takes single object parameter of multiple styles
      * @param property String/Object The style property to be set, or an object of multiple styles.
      * @param value String The value to apply to the given property, or null if an object was passed.
      * @returns Ext.draw.Sprite this
      */
    var setStyle: js.UndefOr[
        js.Function2[/* property */ js.UndefOr[Any], /* value */ js.UndefOr[java.lang.String], this.type]
      ] = js.undefined
    
    /** [Method] Shows the sprite
      * @param redraw Boolean Flag to immediately draw the change.
      * @returns Ext.draw.Sprite this
      */
    var show: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[Boolean], this.type]] = js.undefined
    
    /** [Config Option] (String) */
    var src: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
      * @returns Ext.Element The Element
      */
    var stopAnimation: js.UndefOr[js.Function0[IElement]] = js.undefined
    
    /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
      * @returns Ext.Element The Element
      */
    var stopFx: js.UndefOr[js.Function0[IElement]] = js.undefined
    
    /** [Config Option] (String) */
    var stroke: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Number) */
    var strokewidth: js.UndefOr[Double] = js.undefined
    
    /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
      * @returns Object this
      */
    var syncFx: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Config Option] (String) */
    var text: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var `type`: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Number) */
    var width: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var x: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Number) */
    var y: js.UndefOr[Double] = js.undefined
  }
  object ISprite {
    
    inline def apply(): ISprite = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISprite]
    }
    
    extension [Self <: ISprite](x: Self) {
      
      inline def setAddCls(value: /* className */ js.UndefOr[Any] => ISprite): Self = StObject.set(x, "addCls", js.Any.fromFunction1(value))
      
      inline def setAddClsUndefined: Self = StObject.set(x, "addCls", js.undefined)
      
      inline def setAnimate(value: Any | (js.Function1[/* config */ js.UndefOr[Any], Any])): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateFunction1(value: /* config */ js.UndefOr[Any] => Any): Self = StObject.set(x, "animate", js.Any.fromFunction1(value))
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setDd(value: IDragSource): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
      
      inline def setDdUndefined: Self = StObject.set(x, "dd", js.undefined)
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setFill(value: java.lang.String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: java.lang.String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setGetActiveAnimation(value: () => Any): Self = StObject.set(x, "getActiveAnimation", js.Any.fromFunction0(value))
      
      inline def setGetActiveAnimationUndefined: Self = StObject.set(x, "getActiveAnimation", js.undefined)
      
      inline def setGetBBox(value: () => Any): Self = StObject.set(x, "getBBox", js.Any.fromFunction0(value))
      
      inline def setGetBBoxUndefined: Self = StObject.set(x, "getBBox", js.undefined)
      
      inline def setGroup(value: Any): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setHasActiveFx(value: () => Any): Self = StObject.set(x, "hasActiveFx", js.Any.fromFunction0(value))
      
      inline def setHasActiveFxUndefined: Self = StObject.set(x, "hasActiveFx", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHide(value: /* redraw */ js.UndefOr[Boolean] => ISprite): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setIsSprite(value: Boolean): Self = StObject.set(x, "isSprite", value.asInstanceOf[js.Any])
      
      inline def setIsSpriteUndefined: Self = StObject.set(x, "isSprite", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRadiusX(value: Double): Self = StObject.set(x, "radiusX", value.asInstanceOf[js.Any])
      
      inline def setRadiusXUndefined: Self = StObject.set(x, "radiusX", js.undefined)
      
      inline def setRadiusY(value: Double): Self = StObject.set(x, "radiusY", value.asInstanceOf[js.Any])
      
      inline def setRadiusYUndefined: Self = StObject.set(x, "radiusY", js.undefined)
      
      inline def setRedraw(value: () => ISprite): Self = StObject.set(x, "redraw", js.Any.fromFunction0(value))
      
      inline def setRedrawUndefined: Self = StObject.set(x, "redraw", js.undefined)
      
      inline def setRemove(value: () => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
      
      inline def setRemoveCls(value: /* className */ js.UndefOr[Any] => ISprite): Self = StObject.set(x, "removeCls", js.Any.fromFunction1(value))
      
      inline def setRemoveClsUndefined: Self = StObject.set(x, "removeCls", js.undefined)
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setSequenceFx(value: () => Any): Self = StObject.set(x, "sequenceFx", js.Any.fromFunction0(value))
      
      inline def setSequenceFxUndefined: Self = StObject.set(x, "sequenceFx", js.undefined)
      
      inline def setSetAttributes(value: (/* attrs */ js.UndefOr[Any], /* redraw */ js.UndefOr[Boolean]) => ISprite): Self = StObject.set(x, "setAttributes", js.Any.fromFunction2(value))
      
      inline def setSetAttributesUndefined: Self = StObject.set(x, "setAttributes", js.undefined)
      
      inline def setSetStyle(value: (/* property */ js.UndefOr[Any], /* value */ js.UndefOr[java.lang.String]) => ISprite): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
      
      inline def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
      
      inline def setShow(value: /* redraw */ js.UndefOr[Boolean] => ISprite): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSrc(value: java.lang.String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setStopAnimation(value: () => IElement): Self = StObject.set(x, "stopAnimation", js.Any.fromFunction0(value))
      
      inline def setStopAnimationUndefined: Self = StObject.set(x, "stopAnimation", js.undefined)
      
      inline def setStopFx(value: () => IElement): Self = StObject.set(x, "stopFx", js.Any.fromFunction0(value))
      
      inline def setStopFxUndefined: Self = StObject.set(x, "stopFx", js.undefined)
      
      inline def setStroke(value: java.lang.String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokewidth(value: Double): Self = StObject.set(x, "strokewidth", value.asInstanceOf[js.Any])
      
      inline def setStrokewidthUndefined: Self = StObject.set(x, "strokewidth", js.undefined)
      
      inline def setSyncFx(value: () => Any): Self = StObject.set(x, "syncFx", js.Any.fromFunction0(value))
      
      inline def setSyncFxUndefined: Self = StObject.set(x, "syncFx", js.undefined)
      
      inline def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ISpriteDD
    extends StObject
       with IDragSource {
    
    /** [Method] Returns a reference to the actual element to drag
      * @param e Object
      * @returns HTMLElement the html element
      */
    @JSName("getDragEl")
    var getDragEl_ISpriteDD: js.UndefOr[js.Function1[/* e */ js.UndefOr[Any], HTMLElement]] = js.undefined
    
    /** [Method] Abstract method called during the onMouseMove event while dragging an object
      * @param e Object
      */
    @JSName("onDrag")
    var onDrag_ISpriteDD: js.UndefOr[js.Function1[/* e */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the drag element to the location of the mousedown or click event maintaining the cursor location relative to th  */
    @JSName("setDragElPos")
    var setDragElPos_ISpriteDD: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ISpriteDD {
    
    inline def apply(): ISpriteDD = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISpriteDD]
    }
    
    extension [Self <: ISpriteDD](x: Self) {
      
      inline def setGetDragEl(value: /* e */ js.UndefOr[Any] => HTMLElement): Self = StObject.set(x, "getDragEl", js.Any.fromFunction1(value))
      
      inline def setGetDragElUndefined: Self = StObject.set(x, "getDragEl", js.undefined)
      
      inline def setOnDrag(value: /* e */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setSetDragElPos(value: () => Unit): Self = StObject.set(x, "setDragElPos", js.Any.fromFunction0(value))
      
      inline def setSetDragElPosUndefined: Self = StObject.set(x, "setDragElPos", js.undefined)
    }
  }
  
  trait ISurface
    extends StObject
       with IObservable {
    
    /** [Method] Adds a Sprite to the surface
      * @param args Ext.draw.Sprite[]/Ext.draw.Sprite... One or more Sprite objects or configs.
      * @returns Ext.draw.Sprite[]/Ext.draw.Sprite The sprites added.
      */
    var add: js.UndefOr[js.Function1[/* args */ js.UndefOr[Any], Any]] = js.undefined
    
    /** [Method] Adds one or more CSS classes to the element
      * @param sprite Object The sprite to add the class to.
      * @param className String/String[] The CSS class to add, or an array of classes
      */
    var addCls: js.UndefOr[
        js.Function2[/* sprite */ js.UndefOr[Any], /* className */ js.UndefOr[Any], Unit]
      ] = js.undefined
    
    /** [Method] Adds a gradient definition to the Surface
      * @param gradient Object A gradient config.
      */
    var addGradient: js.UndefOr[js.Function1[/* gradient */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Destroys the surface  */
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Returns a new group or an existent group associated with the current surface
      * @param id String The unique identifier of the group.
      * @returns Object The Ext.draw.CompositeSprite.
      */
    var getGroup: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], Any]] = js.undefined
    
    /** [Method] Retrieves the id of this component  */
    var getId: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var height: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (Ext.draw.Sprite[]) */
    var items: js.UndefOr[Array] = js.undefined
    
    /** [Method] Removes a given sprite from the surface optionally destroying the sprite in the process
      * @param sprite Ext.draw.Sprite
      * @param destroySprite Boolean
      */
    var remove: js.UndefOr[
        js.Function2[/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean], Unit]
      ] = js.undefined
    
    /** [Method] Removes all sprites from the surface optionally destroying the sprites in the process
      * @param destroySprites Boolean Whether to destroy all sprites when removing them.
      */
    var removeAll: js.UndefOr[js.Function1[/* destroySprites */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Removes one or more CSS classes from the element
      * @param sprite Object The sprite to remove the class from.
      * @param className String/String[] The CSS class to remove, or an array of classes
      */
    var removeCls: js.UndefOr[
        js.Function2[/* sprite */ js.UndefOr[Any], /* className */ js.UndefOr[Any], Unit]
      ] = js.undefined
    
    /** [Method] Sets the size of the surface
      * @param w Number The new width of the canvas.
      * @param h Number The new height of the canvas.
      */
    var setSize: js.UndefOr[js.Function2[/* w */ js.UndefOr[Double], /* h */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets CSS style attributes to an element
      * @param sprite Object The sprite to add, or an array of classes to
      * @param styles Object An Object with CSS styles.
      */
    var setStyle: js.UndefOr[js.Function2[/* sprite */ js.UndefOr[Any], /* styles */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Changes the text in the sprite element
      * @param sprite Object The Sprite to change the text.
      * @param text String The new text to be set.
      */
    var setText: js.UndefOr[
        js.Function2[/* sprite */ js.UndefOr[Any], /* text */ js.UndefOr[java.lang.String], Unit]
      ] = js.undefined
    
    /** [Config Option] (Number) */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ISurface {
    
    inline def apply(): ISurface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISurface]
    }
    
    extension [Self <: ISurface](x: Self) {
      
      inline def setAdd(value: /* args */ js.UndefOr[Any] => Any): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setAddCls(value: (/* sprite */ js.UndefOr[Any], /* className */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "addCls", js.Any.fromFunction2(value))
      
      inline def setAddClsUndefined: Self = StObject.set(x, "addCls", js.undefined)
      
      inline def setAddGradient(value: /* gradient */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "addGradient", js.Any.fromFunction1(value))
      
      inline def setAddGradientUndefined: Self = StObject.set(x, "addGradient", js.undefined)
      
      inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setGetGroup(value: /* id */ js.UndefOr[java.lang.String] => Any): Self = StObject.set(x, "getGroup", js.Any.fromFunction1(value))
      
      inline def setGetGroupUndefined: Self = StObject.set(x, "getGroup", js.undefined)
      
      inline def setGetId(value: () => Unit): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
      
      inline def setGetIdUndefined: Self = StObject.set(x, "getId", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setItems(value: Array): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setRemove(value: (/* sprite */ js.UndefOr[ISprite], /* destroySprite */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      inline def setRemoveAll(value: /* destroySprites */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "removeAll", js.Any.fromFunction1(value))
      
      inline def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
      
      inline def setRemoveCls(value: (/* sprite */ js.UndefOr[Any], /* className */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "removeCls", js.Any.fromFunction2(value))
      
      inline def setRemoveClsUndefined: Self = StObject.set(x, "removeCls", js.undefined)
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setSetSize(value: (/* w */ js.UndefOr[Double], /* h */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
      
      inline def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
      
      inline def setSetStyle(value: (/* sprite */ js.UndefOr[Any], /* styles */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction2(value))
      
      inline def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
      
      inline def setSetText(value: (/* sprite */ js.UndefOr[Any], /* text */ js.UndefOr[java.lang.String]) => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction2(value))
      
      inline def setSetTextUndefined: Self = StObject.set(x, "setText", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IText
    extends StObject
       with typings.extjs.Ext.draw.IComponent {
    
    /** [Config Option] (Number) */
    var degrees: js.UndefOr[Double] = js.undefined
    
    /** [Method] Sets the clockwise rotation angle relative to the horizontal axis
      * @param degrees Number The clockwise angle (in degrees) from the horizontal axis by which the text should be rotated.
      */
    var setAngle: js.UndefOr[js.Function1[/* degrees */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Updates this item s text
      * @param t String The text to display (html not accepted).
      */
    var setText: js.UndefOr[js.Function1[/* t */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var styleSelector: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var text: js.UndefOr[java.lang.String] = js.undefined
  }
  object IText {
    
    inline def apply(): IText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IText]
    }
    
    extension [Self <: IText](x: Self) {
      
      inline def setDegrees(value: Double): Self = StObject.set(x, "degrees", value.asInstanceOf[js.Any])
      
      inline def setDegreesUndefined: Self = StObject.set(x, "degrees", js.undefined)
      
      inline def setSetAngle(value: /* degrees */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setAngle", js.Any.fromFunction1(value))
      
      inline def setSetAngleUndefined: Self = StObject.set(x, "setAngle", js.undefined)
      
      inline def setSetText(value: /* t */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
      
      inline def setSetTextUndefined: Self = StObject.set(x, "setText", js.undefined)
      
      inline def setStyleSelector(value: java.lang.String): Self = StObject.set(x, "styleSelector", value.asInstanceOf[js.Any])
      
      inline def setStyleSelectorUndefined: Self = StObject.set(x, "styleSelector", js.undefined)
      
      inline def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait Surface extends StObject
  
  object engine {
    
    type IImageExporter = IBase
    
    trait ISvg
      extends StObject
         with ISurface {
      
      /** [Method] Insert or move a given sprite s element to the correct place in the DOM list for its zIndex
        * @param sprite Ext.draw.Sprite
        */
      var applyZIndex: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Unit]] = js.undefined
      
      /** [Method] Get the region for the surface s canvas area
        * @returns Ext.util.Region
        */
      var getRegion: js.UndefOr[js.Function0[IRegion]] = js.undefined
      
      /** [Method] Checks if the specified CSS class exists on this element s DOM node
        * @param sprite Ext.draw.Sprite The sprite to look into.
        * @param className String The CSS class to check for
        * @returns Boolean True if the class exists, else false
        */
      var hasCls: js.UndefOr[
            js.Function2[
              /* sprite */ js.UndefOr[ISprite], 
              /* className */ js.UndefOr[java.lang.String], 
              Boolean
            ]
          ] = js.undefined
      
      /** [Method] Sets the size of the surface
        * @param width Object
        * @param height Object
        */
      @JSName("setSize")
      var setSize_ISvg: js.UndefOr[js.Function2[/* width */ js.UndefOr[Any], /* height */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Changes the text in the sprite element
        * @param sprite Object
        * @param textString Object
        */
      @JSName("setText")
      var setText_ISvg: js.UndefOr[
            js.Function2[/* sprite */ js.UndefOr[Any], /* textString */ js.UndefOr[Any], Unit]
          ] = js.undefined
    }
    object ISvg {
      
      inline def apply(): ISvg = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISvg]
      }
      
      extension [Self <: ISvg](x: Self) {
        
        inline def setApplyZIndex(value: /* sprite */ js.UndefOr[ISprite] => Unit): Self = StObject.set(x, "applyZIndex", js.Any.fromFunction1(value))
        
        inline def setApplyZIndexUndefined: Self = StObject.set(x, "applyZIndex", js.undefined)
        
        inline def setGetRegion(value: () => IRegion): Self = StObject.set(x, "getRegion", js.Any.fromFunction0(value))
        
        inline def setGetRegionUndefined: Self = StObject.set(x, "getRegion", js.undefined)
        
        inline def setHasCls(value: (/* sprite */ js.UndefOr[ISprite], /* className */ js.UndefOr[java.lang.String]) => Boolean): Self = StObject.set(x, "hasCls", js.Any.fromFunction2(value))
        
        inline def setHasClsUndefined: Self = StObject.set(x, "hasCls", js.undefined)
        
        inline def setSetSize(value: (/* width */ js.UndefOr[Any], /* height */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
        
        inline def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
        
        inline def setSetText(value: (/* sprite */ js.UndefOr[Any], /* textString */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction2(value))
        
        inline def setSetTextUndefined: Self = StObject.set(x, "setText", js.undefined)
      }
    }
    
    type ISvgExporter = IBase
    
    trait IVml
      extends StObject
         with ISurface {
      
      /** [Method] Sets the size of the surface
        * @param width Object
        * @param height Object
        */
      @JSName("setSize")
      var setSize_IVml: js.UndefOr[js.Function2[/* width */ js.UndefOr[Any], /* height */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Changes the text in the sprite element
        * @param sprite Object
        * @param text Object
        */
      @JSName("setText")
      var setText_IVml: js.UndefOr[js.Function2[/* sprite */ js.UndefOr[Any], /* text */ js.UndefOr[Any], Unit]] = js.undefined
    }
    object IVml {
      
      inline def apply(): IVml = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IVml]
      }
      
      extension [Self <: IVml](x: Self) {
        
        inline def setSetSize(value: (/* width */ js.UndefOr[Any], /* height */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
        
        inline def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
        
        inline def setSetText(value: (/* sprite */ js.UndefOr[Any], /* text */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction2(value))
        
        inline def setSetTextUndefined: Self = StObject.set(x, "setText", js.undefined)
      }
    }
    
    trait ImageExporter extends StObject
    
    trait SvgExporter extends StObject
  }
}
