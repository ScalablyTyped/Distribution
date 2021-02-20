package typings.gapiAnalytics

import typings.gapiAnalytics.gapi.client.analytics.kB.parameters.AnalyticsParameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object analytics {
        
        object data {
          
          object ga {
            
            @JSGlobal("gapi.client.analytics.data.ga.get")
            @js.native
            def get(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.data.ga.get")
            @js.native
            def get(data: DataQuery): js.Promise[_] = js.native
          }
          
          object mcf {
            
            @JSGlobal("gapi.client.analytics.data.mcf.get")
            @js.native
            def get(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.data.mcf.get")
            @js.native
            def get(data: DataQuery): js.Promise[_] = js.native
          }
          
          object realtime {
            
            @JSGlobal("gapi.client.analytics.data.realtime.get")
            @js.native
            def get(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.data.realtime.get")
            @js.native
            def get(data: DataQuery): js.Promise[_] = js.native
          }
        }
        
        object kB {
          
          object parameters {
            
            @JSGlobal("gapi.client.analytics.kB.parameters.alt")
            @js.native
            class alt () extends AnalyticsParameter
            
            @JSGlobal("gapi.client.analytics.kB.parameters.fields")
            @js.native
            class fields () extends AnalyticsParameter
            
            @JSGlobal("gapi.client.analytics.kB.parameters.key")
            @js.native
            class key () extends AnalyticsParameter
            
            @JSGlobal("gapi.client.analytics.kB.parameters.oauth_token")
            @js.native
            class oauthToken () extends AnalyticsParameter
            
            @JSGlobal("gapi.client.analytics.kB.parameters.prettyPrint")
            @js.native
            class prettyPrint () extends AnalyticsParameter
            
            @JSGlobal("gapi.client.analytics.kB.parameters.quotaUser")
            @js.native
            class quotaUser () extends AnalyticsParameter
            
            @JSGlobal("gapi.client.analytics.kB.parameters.userIP")
            @js.native
            class userIP () extends AnalyticsParameter
          }
        }
        
        object management {
          
          object accountSummaries {
            
            @JSGlobal("gapi.client.analytics.management.accountSummaries.list")
            @js.native
            def list(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.management.accountSummaries.list")
            @js.native
            def list(view: View): js.Promise[_] = js.native
          }
          
          object accountUserLinks {
            
            @JSGlobal("gapi.client.analytics.management.accountUserLinks.list")
            @js.native
            def list(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.management.accountUserLinks.list")
            @js.native
            def list(view: View): js.Promise[_] = js.native
          }
          
          object accounts {
            
            @JSGlobal("gapi.client.analytics.management.accounts.list")
            @js.native
            def list(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.management.accounts.list")
            @js.native
            def list(view: View): js.Promise[_] = js.native
          }
          
          object customDataSources {
            
            @JSGlobal("gapi.client.analytics.management.customDataSources.list")
            @js.native
            def list(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.management.customDataSources.list")
            @js.native
            def list(view: View): js.Promise[_] = js.native
          }
          
          object customDimensions {
            
            @JSGlobal("gapi.client.analytics.management.customDimensions.list")
            @js.native
            def list(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.management.customDimensions.list")
            @js.native
            def list(view: View): js.Promise[_] = js.native
          }
          
          object customMetrics {
            
            @JSGlobal("gapi.client.analytics.management.customMetrics.list")
            @js.native
            def list(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.management.customMetrics.list")
            @js.native
            def list(view: View): js.Promise[_] = js.native
          }
          
          object experiments {
            
            @JSGlobal("gapi.client.analytics.management.experiments.list")
            @js.native
            def list(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.management.experiments.list")
            @js.native
            def list(view: View): js.Promise[_] = js.native
          }
          
          object filters {
            
            @JSGlobal("gapi.client.analytics.management.filters.list")
            @js.native
            def list(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.management.filters.list")
            @js.native
            def list(view: View): js.Promise[_] = js.native
          }
          
          object goals {
            
            @JSGlobal("gapi.client.analytics.management.goals.list")
            @js.native
            def list(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.management.goals.list")
            @js.native
            def list(view: View): js.Promise[_] = js.native
          }
          
          object profileFilterLinks {
            
            @JSGlobal("gapi.client.analytics.management.profileFilterLinks.list")
            @js.native
            def list(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.management.profileFilterLinks.list")
            @js.native
            def list(view: View): js.Promise[_] = js.native
          }
          
          object profileUserLinks {
            
            @JSGlobal("gapi.client.analytics.management.profileUserLinks.list")
            @js.native
            def list(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.management.profileUserLinks.list")
            @js.native
            def list(view: View): js.Promise[_] = js.native
          }
          
          object profiles {
            
            @JSGlobal("gapi.client.analytics.management.profiles.list")
            @js.native
            def list(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.management.profiles.list")
            @js.native
            def list(view: View): js.Promise[_] = js.native
          }
          
          object remarketingAudience {
            
            @JSGlobal("gapi.client.analytics.management.remarketingAudience.list")
            @js.native
            def list(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.management.remarketingAudience.list")
            @js.native
            def list(view: View): js.Promise[_] = js.native
          }
          
          object segments {
            
            @JSGlobal("gapi.client.analytics.management.segments.list")
            @js.native
            def list(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.management.segments.list")
            @js.native
            def list(view: View): js.Promise[_] = js.native
          }
          
          object unsampledReports {
            
            @JSGlobal("gapi.client.analytics.management.unsampledReports.list")
            @js.native
            def list(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.management.unsampledReports.list")
            @js.native
            def list(view: View): js.Promise[_] = js.native
          }
          
          object uploads {
            
            @JSGlobal("gapi.client.analytics.management.uploads.list")
            @js.native
            def list(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.management.uploads.list")
            @js.native
            def list(view: View): js.Promise[_] = js.native
          }
          
          object webPropertyAdWordsLinks {
            
            @JSGlobal("gapi.client.analytics.management.webPropertyAdWordsLinks.list")
            @js.native
            def list(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.management.webPropertyAdWordsLinks.list")
            @js.native
            def list(view: View): js.Promise[_] = js.native
          }
          
          object webproperties {
            
            @JSGlobal("gapi.client.analytics.management.webproperties.list")
            @js.native
            def list(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.management.webproperties.list")
            @js.native
            def list(view: View): js.Promise[_] = js.native
          }
          
          object webpropertyUserLinks {
            
            @JSGlobal("gapi.client.analytics.management.webpropertyUserLinks.list")
            @js.native
            def list(): js.Promise[_] = js.native
            @JSGlobal("gapi.client.analytics.management.webpropertyUserLinks.list")
            @js.native
            def list(view: View): js.Promise[_] = js.native
          }
        }
        
        object metadata {
          
          object column {
            
            @JSGlobal("gapi.client.analytics.metadata.column.list")
            @js.native
            def list(): js.Promise[_] = js.native
          }
        }
        
        object provisioning {
          
          @JSGlobal("gapi.client.analytics.provisioning.createAccountTicket")
          @js.native
          def createAccountTicket(): js.Promise[_] = js.native
        }
      }
    }
  }
}
