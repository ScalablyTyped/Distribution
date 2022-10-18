package typings.expoWebBrowser.buildWebBrowserDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebBrowserCustomTabsResults extends StObject {
  
  /**
    * All packages recognized by `PackageManager` as capable of handling Custom Tabs. Empty array
    * means there is no supporting browsers on device.
    */
  var browserPackages: js.Array[String]
  
  /**
    * Default package chosen by user, `null` if there is no such packages. Also `null` usually means,
    * that user will be prompted to choose from available packages.
    */
  var defaultBrowserPackage: js.UndefOr[String] = js.undefined
  
  /**
    * Package preferred by `CustomTabsClient` to be used to handle Custom Tabs. It favors browser
    * chosen by user as default, as long as it is present on both `browserPackages` and
    * `servicePackages` lists. Only such browsers are considered as fully supporting Custom Tabs.
    * It might be `null` when there is no such browser installed or when default browser is not in
    * `servicePackages` list.
    */
  var preferredBrowserPackage: js.UndefOr[String] = js.undefined
  
  /**
    * All packages recognized by `PackageManager` as capable of handling Custom Tabs Service.
    * This service is used by [`warmUpAsync`](#webbrowserwarmupasyncbrowserpackage), [`mayInitWithUrlAsync`](#webbrowsermayinitwithurlasyncurl-browserpackage)
    * and [`coolDownAsync`](#webbrowsercooldownasyncbrowserpackage).
    */
  var servicePackages: js.Array[String]
}
object WebBrowserCustomTabsResults {
  
  inline def apply(browserPackages: js.Array[String], servicePackages: js.Array[String]): WebBrowserCustomTabsResults = {
    val __obj = js.Dynamic.literal(browserPackages = browserPackages.asInstanceOf[js.Any], servicePackages = servicePackages.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebBrowserCustomTabsResults]
  }
  
  extension [Self <: WebBrowserCustomTabsResults](x: Self) {
    
    inline def setBrowserPackages(value: js.Array[String]): Self = StObject.set(x, "browserPackages", value.asInstanceOf[js.Any])
    
    inline def setBrowserPackagesVarargs(value: String*): Self = StObject.set(x, "browserPackages", js.Array(value*))
    
    inline def setDefaultBrowserPackage(value: String): Self = StObject.set(x, "defaultBrowserPackage", value.asInstanceOf[js.Any])
    
    inline def setDefaultBrowserPackageUndefined: Self = StObject.set(x, "defaultBrowserPackage", js.undefined)
    
    inline def setPreferredBrowserPackage(value: String): Self = StObject.set(x, "preferredBrowserPackage", value.asInstanceOf[js.Any])
    
    inline def setPreferredBrowserPackageUndefined: Self = StObject.set(x, "preferredBrowserPackage", js.undefined)
    
    inline def setServicePackages(value: js.Array[String]): Self = StObject.set(x, "servicePackages", value.asInstanceOf[js.Any])
    
    inline def setServicePackagesVarargs(value: String*): Self = StObject.set(x, "servicePackages", js.Array(value*))
  }
}
