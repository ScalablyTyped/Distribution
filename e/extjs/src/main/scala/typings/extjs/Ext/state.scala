package typings.extjs.Ext

import typings.extjs.Ext.util.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object state {
  
  @js.native
  trait ICookieProvider extends IProvider {
    
    /** [Method] private
      * @param name Object
      */
    @JSName("clear")
    var clear_ICookieProvider: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Config Option] (String) */
    var domain: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Date) */
    var expires: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var path: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Boolean) */
    var secure: js.UndefOr[Boolean] = js.native
    
    /** [Method] private
      * @param name Object
      * @param value Object
      */
    @JSName("set")
    var set_ICookieProvider: js.UndefOr[
        js.Function2[/* name */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], Unit]
      ] = js.native
  }
  object ICookieProvider {
    
    @scala.inline
    def apply(): ICookieProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICookieProvider]
    }
    
    @scala.inline
    implicit class ICookieProviderMutableBuilder[Self <: ICookieProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: /* name */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setDomain(value: java.lang.String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setExpires(value: js.Any): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      @scala.inline
      def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setSet(value: (/* name */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    }
  }
  
  @js.native
  trait ILocalStorageProvider extends IProvider {
    
    /** [Method] private
      * @param name Object
      */
    @JSName("clear")
    var clear_ILocalStorageProvider: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value for a key
      * @param name Object
      * @param value Object
      */
    @JSName("set")
    var set_ILocalStorageProvider: js.UndefOr[
        js.Function2[/* name */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], Unit]
      ] = js.native
  }
  object ILocalStorageProvider {
    
    @scala.inline
    def apply(): ILocalStorageProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILocalStorageProvider]
    }
    
    @scala.inline
    implicit class ILocalStorageProviderMutableBuilder[Self <: ILocalStorageProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: /* name */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setSet(value: (/* name */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    }
  }
  
  type IManager = IBase
  
  @js.native
  trait IProvider extends IObservable {
    
    /** [Method] Clears a value from the state
      * @param name String The key name
      */
    var clear: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Decodes a string previously encoded with encodeValue
      * @param value String The value to decode
      * @returns Object The decoded value
      */
    var decodeValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[java.lang.String], _]] = js.native
    
    /** [Method] Encodes a value including type information
      * @param value Object The value to encode
      * @returns String The encoded value
      */
    var encodeValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], java.lang.String]] = js.native
    
    /** [Method] Returns the current value for a key
      * @param name String The key name
      * @param defaultValue Object A default value to return if the key's value is not found
      * @returns Object The state data
      */
    var get: js.UndefOr[
        js.Function2[/* name */ js.UndefOr[java.lang.String], /* defaultValue */ js.UndefOr[js.Any], _]
      ] = js.native
    
    /** [Config Option] (String) */
    var prefix: js.UndefOr[java.lang.String] = js.native
    
    /** [Method] Sets the value for a key
      * @param name String The key name
      * @param value Object The value to set
      */
    var set: js.UndefOr[
        js.Function2[/* name */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], Unit]
      ] = js.native
  }
  object IProvider {
    
    @scala.inline
    def apply(): IProvider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProvider]
    }
    
    @scala.inline
    implicit class IProviderMutableBuilder[Self <: IProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: /* name */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setDecodeValue(value: /* value */ js.UndefOr[java.lang.String] => _): Self = StObject.set(x, "decodeValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDecodeValueUndefined: Self = StObject.set(x, "decodeValue", js.undefined)
      
      @scala.inline
      def setEncodeValue(value: /* value */ js.UndefOr[js.Any] => java.lang.String): Self = StObject.set(x, "encodeValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncodeValueUndefined: Self = StObject.set(x, "encodeValue", js.undefined)
      
      @scala.inline
      def setGet(value: (/* name */ js.UndefOr[java.lang.String], /* defaultValue */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      @scala.inline
      def setPrefix(value: java.lang.String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSet(value: (/* name */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    }
  }
  
  @js.native
  trait IStateful extends IObservable {
    
    /** [Method] Add events that will trigger the state to be saved
      * @param events String/String[] The event name or an array of event names.
      */
    var addStateEvents: js.UndefOr[js.Function1[/* events */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Applies the state to the object
      * @param state Object The state
      */
    var applyState: js.UndefOr[js.Function1[/* state */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Destroys this stateful object  */
    var destroy: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Method] Gets the current state of the object
      * @returns Object The current state
      */
    var getState: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Config Option] (Number) */
    var saveDelay: js.UndefOr[Double] = js.native
    
    /** [Method] Conditionally saves a single property from this object to the given state object
      * @param propName String The name of the property to save.
      * @param state Object The state object in to which to save the property.
      * @param stateName String The name to use for the property in state.
      * @returns Boolean True if the property was saved, false if not.
      */
    var savePropToState: js.UndefOr[
        js.Function3[
          /* propName */ js.UndefOr[java.lang.String], 
          /* state */ js.UndefOr[js.Any], 
          /* stateName */ js.UndefOr[java.lang.String], 
          Boolean
        ]
      ] = js.native
    
    /** [Method] Gathers additional named properties of the instance and adds their current values to the passed state object
      * @param propNames String/String[] The name (or array of names) of the property to save.
      * @param state Object The state object in to which to save the property values.
      * @returns Object state
      */
    var savePropsToState: js.UndefOr[
        js.Function2[/* propNames */ js.UndefOr[js.Any], /* state */ js.UndefOr[js.Any], _]
      ] = js.native
    
    /** [Method] Saves the state of the object to the persistence store  */
    var saveState: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** [Config Option] (String[]) */
    var stateEvents: js.UndefOr[Array] = js.native
    
    /** [Config Option] (String) */
    var stateId: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Boolean) */
    var stateful: js.UndefOr[Boolean] = js.native
  }
  object IStateful {
    
    @scala.inline
    def apply(): IStateful = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStateful]
    }
    
    @scala.inline
    implicit class IStatefulMutableBuilder[Self <: IStateful] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddStateEvents(value: /* events */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "addStateEvents", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddStateEventsUndefined: Self = StObject.set(x, "addStateEvents", js.undefined)
      
      @scala.inline
      def setApplyState(value: /* state */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "applyState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setApplyStateUndefined: Self = StObject.set(x, "applyState", js.undefined)
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setGetState(value: () => _): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStateUndefined: Self = StObject.set(x, "getState", js.undefined)
      
      @scala.inline
      def setSaveDelay(value: Double): Self = StObject.set(x, "saveDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveDelayUndefined: Self = StObject.set(x, "saveDelay", js.undefined)
      
      @scala.inline
      def setSavePropToState(
        value: (/* propName */ js.UndefOr[java.lang.String], /* state */ js.UndefOr[js.Any], /* stateName */ js.UndefOr[java.lang.String]) => Boolean
      ): Self = StObject.set(x, "savePropToState", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSavePropToStateUndefined: Self = StObject.set(x, "savePropToState", js.undefined)
      
      @scala.inline
      def setSavePropsToState(value: (/* propNames */ js.UndefOr[js.Any], /* state */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "savePropsToState", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSavePropsToStateUndefined: Self = StObject.set(x, "savePropsToState", js.undefined)
      
      @scala.inline
      def setSaveState(value: () => Unit): Self = StObject.set(x, "saveState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSaveStateUndefined: Self = StObject.set(x, "saveState", js.undefined)
      
      @scala.inline
      def setStateEvents(value: Array): Self = StObject.set(x, "stateEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateEventsUndefined: Self = StObject.set(x, "stateEvents", js.undefined)
      
      @scala.inline
      def setStateId(value: java.lang.String): Self = StObject.set(x, "stateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateIdUndefined: Self = StObject.set(x, "stateId", js.undefined)
      
      @scala.inline
      def setStateful(value: Boolean): Self = StObject.set(x, "stateful", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatefulUndefined: Self = StObject.set(x, "stateful", js.undefined)
    }
  }
  
  @js.native
  trait Manager extends StObject
}
