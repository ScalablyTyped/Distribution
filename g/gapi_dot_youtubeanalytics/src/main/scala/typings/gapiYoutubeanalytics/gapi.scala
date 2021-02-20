package typings.gapiYoutubeanalytics

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutubeanalytics.anon.Dimensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object youtubeAnalytics {
      
      @js.native
      trait reports extends StObject {
        
        /**
          * Retrieve your YouTube Analytics reports.
          */
        def query(`object`: Dimensions): HttpRequest[_] = js.native
      }
      object reports {
        
        @scala.inline
        def apply(query: Dimensions => HttpRequest[_]): reports = {
          val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
          __obj.asInstanceOf[reports]
        }
        
        @scala.inline
        implicit class reportsMutableBuilder[Self <: reports] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setQuery(value: Dimensions => HttpRequest[_]): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
