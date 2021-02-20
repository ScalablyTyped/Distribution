package typings.gapiAnalytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object analytics {
      
      object kB {
        
        object parameters {
          
          @js.native
          trait AnalyticsParameter extends StObject {
            
            var default: js.UndefOr[String] = js.native
            
            var description: js.UndefOr[String] = js.native
            
            var enum: js.UndefOr[js.Array[String]] = js.native
            
            var enumDescriptions: js.UndefOr[js.Array[String]] = js.native
            
            var location: js.UndefOr[String] = js.native
            
            var `type`: js.UndefOr[String] = js.native
          }
          object AnalyticsParameter {
            
            @scala.inline
            def apply(): AnalyticsParameter = {
              val __obj = js.Dynamic.literal()
              __obj.asInstanceOf[AnalyticsParameter]
            }
            
            @scala.inline
            implicit class AnalyticsParameterMutableBuilder[Self <: AnalyticsParameter] (val x: Self) extends AnyVal {
              
              @scala.inline
              def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
              
              @scala.inline
              def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
              
              @scala.inline
              def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
              
              @scala.inline
              def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
              
              @scala.inline
              def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
              
              @scala.inline
              def setEnumDescriptions(value: js.Array[String]): Self = StObject.set(x, "enumDescriptions", value.asInstanceOf[js.Any])
              
              @scala.inline
              def setEnumDescriptionsUndefined: Self = StObject.set(x, "enumDescriptions", js.undefined)
              
              @scala.inline
              def setEnumDescriptionsVarargs(value: String*): Self = StObject.set(x, "enumDescriptions", js.Array(value :_*))
              
              @scala.inline
              def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
              
              @scala.inline
              def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value :_*))
              
              @scala.inline
              def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
              
              @scala.inline
              def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
              
              @scala.inline
              def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
              
              @scala.inline
              def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
            }
          }
          
          type alt = AnalyticsParameter
          
          type fields = AnalyticsParameter
          
          type key = AnalyticsParameter
          
          type oauthToken = AnalyticsParameter
          
          type prettyPrint = AnalyticsParameter
          
          type quotaUser = AnalyticsParameter
          
          type userIP = AnalyticsParameter
        }
      }
    }
  }
}
