package typings.googleScriptClientSide

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object google {
  
  object script {
    
    type Parameter = js.UndefOr[
        Double | Boolean | String | (NumberDictionary[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias google.script.client-side.google.script.Parameter */ js.Object
        ]) | (StringDictionary[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias google.script.client-side.google.script.Parameter */ js.Object
        ]) | Null
      ]
    
    @js.native
    trait Runner
      extends /**
      * Executes the server-side Apps Script function with the corresponding name.
      */
    /* functionName */ StringDictionary[
              js.Function2[/* first */ js.UndefOr[Parameter | HTMLFormElement], /* repeated */ Parameter, Unit]
            ] {
      
      /**
        * Sets a callback function to run if the server-side function throws an exception.
        * Without a failure handler, failures are logged to the JavaScript console.
        * To override this, call withFailureHandler(null) or supply a failure handler that does nothing.
        * @param handler a client-side callback function to run if the server-side function throws an exception;
        * the Error object is passed to the function as the first argument, and the user object (if any) is passed as a second argument
        */
      def withFailureHandler(handler: js.Function2[/* error */ Error, /* object */ js.UndefOr[js.Any], Unit]): Runner = js.native
      
      /**
        * Sets a callback function to run if the server-side function returns successfully.
        * @param handler a client-side callback function to run if the server-side function returns successfully;
        * the server's return value is passed to the function as the first argument, and the user object (if any) is passed as a second argument
        */
      def withSuccessHandler(handler: js.Function2[/* value */ js.UndefOr[js.Any], /* object */ js.UndefOr[js.Any], Unit]): Runner = js.native
      
      /**
        * Sets an object to pass as a second parameter to the success and failure handlers.
        * @param object an object to pass as a second parameter to the success and failure handlers;
        * because user objects are not sent to the server, they are not subject to the restrictions on parameters and return values for server calls.
        * User objects cannot, however, be objects constructed with the new operator
        */
      def withUserObject(`object`: js.Any): Runner = js.native
    }
    object Runner {
      
      @scala.inline
      def apply(
        withFailureHandler: js.Function2[/* error */ Error, /* object */ js.UndefOr[js.Any], Unit] => Runner,
        withSuccessHandler: js.Function2[/* value */ js.UndefOr[js.Any], /* object */ js.UndefOr[js.Any], Unit] => Runner,
        withUserObject: js.Any => Runner
      ): Runner = {
        val __obj = js.Dynamic.literal(withFailureHandler = js.Any.fromFunction1(withFailureHandler), withSuccessHandler = js.Any.fromFunction1(withSuccessHandler), withUserObject = js.Any.fromFunction1(withUserObject))
        __obj.asInstanceOf[Runner]
      }
      
      @scala.inline
      implicit class RunnerMutableBuilder[Self <: Runner] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setWithFailureHandler(value: js.Function2[/* error */ Error, /* object */ js.UndefOr[js.Any], Unit] => Runner): Self = StObject.set(x, "withFailureHandler", js.Any.fromFunction1(value))
        
        @scala.inline
        def setWithSuccessHandler(
          value: js.Function2[/* value */ js.UndefOr[js.Any], /* object */ js.UndefOr[js.Any], Unit] => Runner
        ): Self = StObject.set(x, "withSuccessHandler", js.Any.fromFunction1(value))
        
        @scala.inline
        def setWithUserObject(value: js.Any => Runner): Self = StObject.set(x, "withUserObject", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait UrlLocation extends StObject {
      
      /**
        * The string value of URL fragment after the # character, or an emptry string if no URL fragment is present
        */
      var hash: String = js.native
      
      /**
        * An object of key/value pairs that correspond to the URL request parameters.
        * Only the first value will be returned for parameters that have multiple values.
        * If no parameters are present, this will be an empty object.
        */
      var parameter: StringDictionary[String] = js.native
      
      /**
        * An object similar to location.parameter, but with an array of values for each key.
        * If no parameters are present, this will be an empty object.
        */
      var parameters: StringDictionary[js.Array[String]] = js.native
    }
    object UrlLocation {
      
      @scala.inline
      def apply(hash: String, parameter: StringDictionary[String], parameters: StringDictionary[js.Array[String]]): UrlLocation = {
        val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
        __obj.asInstanceOf[UrlLocation]
      }
      
      @scala.inline
      implicit class UrlLocationMutableBuilder[Self <: UrlLocation] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParameter(value: StringDictionary[String]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParameters(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      }
    }
    
    object history {
      
      @js.native
      trait HistoryChangeEvent extends StObject {
        
        /**
          * A location object associated with the popped event
          */
        var location: UrlLocation = js.native
        
        /**
          * The state object associated with the popped event.
          * This object is identical to the state object that used in the corresponding push() or replace() method that added the popped state to the history stack.
          */
        var state: State = js.native
      }
      object HistoryChangeEvent {
        
        @scala.inline
        def apply(location: UrlLocation): HistoryChangeEvent = {
          val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
          __obj.asInstanceOf[HistoryChangeEvent]
        }
        
        @scala.inline
        implicit class HistoryChangeEventMutableBuilder[Self <: HistoryChangeEvent] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setLocation(value: UrlLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStateNull: Self = StObject.set(x, "state", null)
        }
      }
      
      type Query = StringDictionary[String | js.Array[String]]
      
      type State = js.Object | Null
    }
  }
}
