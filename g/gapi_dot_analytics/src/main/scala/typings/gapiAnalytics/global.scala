package typings.gapiAnalytics

import typings.gapiAnalytics.gapi.client.analytics.kB.parameters.AnalyticsParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object analytics {
        
        object data {
          
          object ga {
            
            @JSGlobal("gapi.client.analytics.data.ga")
            @js.native
            val ^ : js.Any = js.native
            
            inline def get(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[js.Any]]
            inline def get(data: DataQuery): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object mcf {
            
            @JSGlobal("gapi.client.analytics.data.mcf")
            @js.native
            val ^ : js.Any = js.native
            
            inline def get(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[js.Any]]
            inline def get(data: DataQuery): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object realtime {
            
            @JSGlobal("gapi.client.analytics.data.realtime")
            @js.native
            val ^ : js.Any = js.native
            
            inline def get(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[js.Any]]
            inline def get(data: DataQuery): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
        }
        
        object kB {
          
          object parameters {
            
            @JSGlobal("gapi.client.analytics.kB.parameters.alt")
            @js.native
            class alt ()
              extends StObject
                 with AnalyticsParameter
            
            @JSGlobal("gapi.client.analytics.kB.parameters.fields")
            @js.native
            class fields ()
              extends StObject
                 with AnalyticsParameter
            
            @JSGlobal("gapi.client.analytics.kB.parameters.key")
            @js.native
            class key ()
              extends StObject
                 with AnalyticsParameter
            
            @JSGlobal("gapi.client.analytics.kB.parameters.oauth_token")
            @js.native
            class oauthToken ()
              extends StObject
                 with AnalyticsParameter
            
            @JSGlobal("gapi.client.analytics.kB.parameters.prettyPrint")
            @js.native
            class prettyPrint ()
              extends StObject
                 with AnalyticsParameter
            
            @JSGlobal("gapi.client.analytics.kB.parameters.quotaUser")
            @js.native
            class quotaUser ()
              extends StObject
                 with AnalyticsParameter
            
            @JSGlobal("gapi.client.analytics.kB.parameters.userIP")
            @js.native
            class userIP ()
              extends StObject
                 with AnalyticsParameter
          }
        }
        
        object management {
          
          object accountSummaries {
            
            @JSGlobal("gapi.client.analytics.management.accountSummaries")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
            inline def list(view: View): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object accountUserLinks {
            
            @JSGlobal("gapi.client.analytics.management.accountUserLinks")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
            inline def list(view: View): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object accounts {
            
            @JSGlobal("gapi.client.analytics.management.accounts")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
            inline def list(view: View): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object customDataSources {
            
            @JSGlobal("gapi.client.analytics.management.customDataSources")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
            inline def list(view: View): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object customDimensions {
            
            @JSGlobal("gapi.client.analytics.management.customDimensions")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
            inline def list(view: View): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object customMetrics {
            
            @JSGlobal("gapi.client.analytics.management.customMetrics")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
            inline def list(view: View): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object experiments {
            
            @JSGlobal("gapi.client.analytics.management.experiments")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
            inline def list(view: View): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object filters {
            
            @JSGlobal("gapi.client.analytics.management.filters")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
            inline def list(view: View): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object goals {
            
            @JSGlobal("gapi.client.analytics.management.goals")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
            inline def list(view: View): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object profileFilterLinks {
            
            @JSGlobal("gapi.client.analytics.management.profileFilterLinks")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
            inline def list(view: View): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object profileUserLinks {
            
            @JSGlobal("gapi.client.analytics.management.profileUserLinks")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
            inline def list(view: View): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object profiles {
            
            @JSGlobal("gapi.client.analytics.management.profiles")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
            inline def list(view: View): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object remarketingAudience {
            
            @JSGlobal("gapi.client.analytics.management.remarketingAudience")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
            inline def list(view: View): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object segments {
            
            @JSGlobal("gapi.client.analytics.management.segments")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
            inline def list(view: View): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object unsampledReports {
            
            @JSGlobal("gapi.client.analytics.management.unsampledReports")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
            inline def list(view: View): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object uploads {
            
            @JSGlobal("gapi.client.analytics.management.uploads")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
            inline def list(view: View): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object webPropertyAdWordsLinks {
            
            @JSGlobal("gapi.client.analytics.management.webPropertyAdWordsLinks")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
            inline def list(view: View): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object webproperties {
            
            @JSGlobal("gapi.client.analytics.management.webproperties")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
            inline def list(view: View): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
          
          object webpropertyUserLinks {
            
            @JSGlobal("gapi.client.analytics.management.webpropertyUserLinks")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
            inline def list(view: View): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(view.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
          }
        }
        
        object metadata {
          
          object column {
            
            @JSGlobal("gapi.client.analytics.metadata.column")
            @js.native
            val ^ : js.Any = js.native
            
            inline def list(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Any]]
          }
        }
        
        object provisioning {
          
          @JSGlobal("gapi.client.analytics.provisioning")
          @js.native
          val ^ : js.Any = js.native
          
          inline def createAccountTicket(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAccountTicket")().asInstanceOf[js.Promise[js.Any]]
        }
      }
    }
  }
}
