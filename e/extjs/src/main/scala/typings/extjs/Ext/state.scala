package typings.extjs.Ext

import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object state {
  
  trait ICookieProvider
    extends StObject
       with IProvider {
    
    /** [Method] private
      * @param name Object
      */
    @JSName("clear")
    var clear_ICookieProvider: js.UndefOr[js.Function1[/* name */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var domain: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Date) */
    var expires: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String) */
    var path: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var secure: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] private
      * @param name Object
      * @param value Object
      */
    @JSName("set")
    var set_ICookieProvider: js.UndefOr[js.Function2[/* name */ js.UndefOr[Any], /* value */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object ICookieProvider {
    
    inline def apply(): ICookieProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICookieProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICookieProvider] (val x: Self) extends AnyVal {
      
      inline def setClear(value: /* name */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setDomain(value: java.lang.String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setExpires(value: Any): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSet(value: (/* name */ js.UndefOr[Any], /* value */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    }
  }
  
  trait ILocalStorageProvider
    extends StObject
       with IProvider {
    
    /** [Method] private
      * @param name Object
      */
    @JSName("clear")
    var clear_ILocalStorageProvider: js.UndefOr[js.Function1[/* name */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value for a key
      * @param name Object
      * @param value Object
      */
    @JSName("set")
    var set_ILocalStorageProvider: js.UndefOr[js.Function2[/* name */ js.UndefOr[Any], /* value */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object ILocalStorageProvider {
    
    inline def apply(): ILocalStorageProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILocalStorageProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILocalStorageProvider] (val x: Self) extends AnyVal {
      
      inline def setClear(value: /* name */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setSet(value: (/* name */ js.UndefOr[Any], /* value */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    }
  }
  
  type IManager = IBase
  
  trait IProvider
    extends StObject
       with IObservable {
    
    /** [Method] Clears a value from the state
      * @param name String The key name
      */
    var clear: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Decodes a string previously encoded with encodeValue
      * @param value String The value to decode
      * @returns Object The decoded value
      */
    var decodeValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[java.lang.String], Any]] = js.undefined
    
    /** [Method] Encodes a value including type information
      * @param value Object The value to encode
      * @returns String The encoded value
      */
    var encodeValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], java.lang.String]] = js.undefined
    
    /** [Method] Returns the current value for a key
      * @param name String The key name
      * @param defaultValue Object A default value to return if the key's value is not found
      * @returns Object The state data
      */
    var get: js.UndefOr[
        js.Function2[/* name */ js.UndefOr[java.lang.String], /* defaultValue */ js.UndefOr[Any], Any]
      ] = js.undefined
    
    /** [Config Option] (String) */
    var prefix: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Sets the value for a key
      * @param name String The key name
      * @param value Object The value to set
      */
    var set: js.UndefOr[
        js.Function2[/* name */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[Any], Unit]
      ] = js.undefined
  }
  object IProvider {
    
    inline def apply(): IProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IProvider] (val x: Self) extends AnyVal {
      
      inline def setClear(value: /* name */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setDecodeValue(value: /* value */ js.UndefOr[java.lang.String] => Any): Self = StObject.set(x, "decodeValue", js.Any.fromFunction1(value))
      
      inline def setDecodeValueUndefined: Self = StObject.set(x, "decodeValue", js.undefined)
      
      inline def setEncodeValue(value: /* value */ js.UndefOr[Any] => java.lang.String): Self = StObject.set(x, "encodeValue", js.Any.fromFunction1(value))
      
      inline def setEncodeValueUndefined: Self = StObject.set(x, "encodeValue", js.undefined)
      
      inline def setGet(value: (/* name */ js.UndefOr[java.lang.String], /* defaultValue */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setPrefix(value: java.lang.String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSet(value: (/* name */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    }
  }
  
  trait IStateful
    extends StObject
       with IObservable {
    
    /** [Method] Add events that will trigger the state to be saved
      * @param events String/String[] The event name or an array of event names.
      */
    var addStateEvents: js.UndefOr[js.Function1[/* events */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Applies the state to the object
      * @param state Object The state
      */
    var applyState: js.UndefOr[js.Function1[/* state */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Destroys this stateful object  */
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Gets the current state of the object
      * @returns Object The current state
      */
    var getState: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Config Option] (Number) */
    var saveDelay: js.UndefOr[Double] = js.undefined
    
    /** [Method] Conditionally saves a single property from this object to the given state object
      * @param propName String The name of the property to save.
      * @param state Object The state object in to which to save the property.
      * @param stateName String The name to use for the property in state.
      * @returns Boolean True if the property was saved, false if not.
      */
    var savePropToState: js.UndefOr[
        js.Function3[
          /* propName */ js.UndefOr[java.lang.String], 
          /* state */ js.UndefOr[Any], 
          /* stateName */ js.UndefOr[java.lang.String], 
          Boolean
        ]
      ] = js.undefined
    
    /** [Method] Gathers additional named properties of the instance and adds their current values to the passed state object
      * @param propNames String/String[] The name (or array of names) of the property to save.
      * @param state Object The state object in to which to save the property values.
      * @returns Object state
      */
    var savePropsToState: js.UndefOr[js.Function2[/* propNames */ js.UndefOr[Any], /* state */ js.UndefOr[Any], Any]] = js.undefined
    
    /** [Method] Saves the state of the object to the persistence store  */
    var saveState: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (String[]) */
    var stateEvents: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (String) */
    var stateId: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var stateful: js.UndefOr[Boolean] = js.undefined
  }
  object IStateful {
    
    inline def apply(): IStateful = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStateful]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IStateful] (val x: Self) extends AnyVal {
      
      inline def setAddStateEvents(value: /* events */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "addStateEvents", js.Any.fromFunction1(value))
      
      inline def setAddStateEventsUndefined: Self = StObject.set(x, "addStateEvents", js.undefined)
      
      inline def setApplyState(value: /* state */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "applyState", js.Any.fromFunction1(value))
      
      inline def setApplyStateUndefined: Self = StObject.set(x, "applyState", js.undefined)
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setGetState(value: () => Any): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      inline def setGetStateUndefined: Self = StObject.set(x, "getState", js.undefined)
      
      inline def setSaveDelay(value: Double): Self = StObject.set(x, "saveDelay", value.asInstanceOf[js.Any])
      
      inline def setSaveDelayUndefined: Self = StObject.set(x, "saveDelay", js.undefined)
      
      inline def setSavePropToState(
        value: (/* propName */ js.UndefOr[java.lang.String], /* state */ js.UndefOr[Any], /* stateName */ js.UndefOr[java.lang.String]) => Boolean
      ): Self = StObject.set(x, "savePropToState", js.Any.fromFunction3(value))
      
      inline def setSavePropToStateUndefined: Self = StObject.set(x, "savePropToState", js.undefined)
      
      inline def setSavePropsToState(value: (/* propNames */ js.UndefOr[Any], /* state */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "savePropsToState", js.Any.fromFunction2(value))
      
      inline def setSavePropsToStateUndefined: Self = StObject.set(x, "savePropsToState", js.undefined)
      
      inline def setSaveState(value: () => Unit): Self = StObject.set(x, "saveState", js.Any.fromFunction0(value))
      
      inline def setSaveStateUndefined: Self = StObject.set(x, "saveState", js.undefined)
      
      inline def setStateEvents(value: Array): Self = StObject.set(x, "stateEvents", value.asInstanceOf[js.Any])
      
      inline def setStateEventsUndefined: Self = StObject.set(x, "stateEvents", js.undefined)
      
      inline def setStateId(value: java.lang.String): Self = StObject.set(x, "stateId", value.asInstanceOf[js.Any])
      
      inline def setStateIdUndefined: Self = StObject.set(x, "stateId", js.undefined)
      
      inline def setStateful(value: Boolean): Self = StObject.set(x, "stateful", value.asInstanceOf[js.Any])
      
      inline def setStatefulUndefined: Self = StObject.set(x, "stateful", js.undefined)
    }
  }
  
  trait Manager extends StObject
}
