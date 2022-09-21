package typings.googleapis

import typings.googleapis.googleapisStrings.v1
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidpublisherV1Mod {
  
  object androidpublisherV1 {
    
    /**
      * Google Play Developer API
      *
      * Accesses Android application developers&#39; Google Play accounts.
      *
      * @example
      * const {google} = require('googleapis');
      * const androidpublisher = google.androidpublisher('v1');
      *
      * @namespace androidpublisher
      * @type {Function}
      * @version v1
      * @variation v1
      * @param {object=} options Options for Androidpublisher
      */
    @JSImport("googleapis/build/src/apis/androidpublisher/v1", "androidpublisher_v1.Androidpublisher")
    @js.native
    open class Androidpublisher protected () extends StObject {
      def this(options: GlobalOptions) = this()
      def this(options: GlobalOptions, google: GoogleConfigurable) = this()
      
      var context: APIRequestContext = js.native
    }
    
    trait Options
      extends StObject
         with GlobalOptions {
      
      var version: v1
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal(version = "v1")
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setVersion(value: v1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
  }
}
