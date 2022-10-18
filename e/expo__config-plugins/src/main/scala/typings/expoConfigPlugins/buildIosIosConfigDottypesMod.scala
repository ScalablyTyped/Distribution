package typings.expoConfigPlugins

import typings.expoConfigPlugins.anon.Branchkey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosIosConfigDottypesMod {
  
  trait ExpoPlist extends StObject {
    
    var EXUpdatesCheckOnLaunch: js.UndefOr[String] = js.undefined
    
    var EXUpdatesCodeSigningCertificate: js.UndefOr[String] = js.undefined
    
    var EXUpdatesCodeSigningMetadata: js.UndefOr[Record[String, String]] = js.undefined
    
    var EXUpdatesEnabled: js.UndefOr[Boolean] = js.undefined
    
    var EXUpdatesLaunchWaitMs: js.UndefOr[Double] = js.undefined
    
    var EXUpdatesReleaseChannel: js.UndefOr[String] = js.undefined
    
    var EXUpdatesRequestHeaders: Record[String, String]
    
    var EXUpdatesRuntimeVersion: js.UndefOr[String] = js.undefined
    
    var EXUpdatesSDKVersion: js.UndefOr[String] = js.undefined
    
    var EXUpdatesURL: js.UndefOr[String] = js.undefined
  }
  object ExpoPlist {
    
    inline def apply(EXUpdatesRequestHeaders: Record[String, String]): ExpoPlist = {
      val __obj = js.Dynamic.literal(EXUpdatesRequestHeaders = EXUpdatesRequestHeaders.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpoPlist]
    }
    
    extension [Self <: ExpoPlist](x: Self) {
      
      inline def setEXUpdatesCheckOnLaunch(value: String): Self = StObject.set(x, "EXUpdatesCheckOnLaunch", value.asInstanceOf[js.Any])
      
      inline def setEXUpdatesCheckOnLaunchUndefined: Self = StObject.set(x, "EXUpdatesCheckOnLaunch", js.undefined)
      
      inline def setEXUpdatesCodeSigningCertificate(value: String): Self = StObject.set(x, "EXUpdatesCodeSigningCertificate", value.asInstanceOf[js.Any])
      
      inline def setEXUpdatesCodeSigningCertificateUndefined: Self = StObject.set(x, "EXUpdatesCodeSigningCertificate", js.undefined)
      
      inline def setEXUpdatesCodeSigningMetadata(value: Record[String, String]): Self = StObject.set(x, "EXUpdatesCodeSigningMetadata", value.asInstanceOf[js.Any])
      
      inline def setEXUpdatesCodeSigningMetadataUndefined: Self = StObject.set(x, "EXUpdatesCodeSigningMetadata", js.undefined)
      
      inline def setEXUpdatesEnabled(value: Boolean): Self = StObject.set(x, "EXUpdatesEnabled", value.asInstanceOf[js.Any])
      
      inline def setEXUpdatesEnabledUndefined: Self = StObject.set(x, "EXUpdatesEnabled", js.undefined)
      
      inline def setEXUpdatesLaunchWaitMs(value: Double): Self = StObject.set(x, "EXUpdatesLaunchWaitMs", value.asInstanceOf[js.Any])
      
      inline def setEXUpdatesLaunchWaitMsUndefined: Self = StObject.set(x, "EXUpdatesLaunchWaitMs", js.undefined)
      
      inline def setEXUpdatesReleaseChannel(value: String): Self = StObject.set(x, "EXUpdatesReleaseChannel", value.asInstanceOf[js.Any])
      
      inline def setEXUpdatesReleaseChannelUndefined: Self = StObject.set(x, "EXUpdatesReleaseChannel", js.undefined)
      
      inline def setEXUpdatesRequestHeaders(value: Record[String, String]): Self = StObject.set(x, "EXUpdatesRequestHeaders", value.asInstanceOf[js.Any])
      
      inline def setEXUpdatesRuntimeVersion(value: String): Self = StObject.set(x, "EXUpdatesRuntimeVersion", value.asInstanceOf[js.Any])
      
      inline def setEXUpdatesRuntimeVersionUndefined: Self = StObject.set(x, "EXUpdatesRuntimeVersion", js.undefined)
      
      inline def setEXUpdatesSDKVersion(value: String): Self = StObject.set(x, "EXUpdatesSDKVersion", value.asInstanceOf[js.Any])
      
      inline def setEXUpdatesSDKVersionUndefined: Self = StObject.set(x, "EXUpdatesSDKVersion", js.undefined)
      
      inline def setEXUpdatesURL(value: String): Self = StObject.set(x, "EXUpdatesURL", value.asInstanceOf[js.Any])
      
      inline def setEXUpdatesURLUndefined: Self = StObject.set(x, "EXUpdatesURL", js.undefined)
    }
  }
  
  type InfoPlist = (Record[
    String, 
    js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONValue */ Any
    ]
  ]) & Branchkey
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoConfigPlugins.expoConfigPluginsStrings.UIInterfaceOrientationPortrait
    - typings.expoConfigPlugins.expoConfigPluginsStrings.UIInterfaceOrientationPortraitUpsideDown
    - typings.expoConfigPlugins.expoConfigPluginsStrings.UIInterfaceOrientationLandscapeLeft
    - typings.expoConfigPlugins.expoConfigPluginsStrings.UIInterfaceOrientationLandscapeRight
  */
  trait InterfaceOrientation extends StObject
  object InterfaceOrientation {
    
    inline def UIInterfaceOrientationLandscapeLeft: typings.expoConfigPlugins.expoConfigPluginsStrings.UIInterfaceOrientationLandscapeLeft = "UIInterfaceOrientationLandscapeLeft".asInstanceOf[typings.expoConfigPlugins.expoConfigPluginsStrings.UIInterfaceOrientationLandscapeLeft]
    
    inline def UIInterfaceOrientationLandscapeRight: typings.expoConfigPlugins.expoConfigPluginsStrings.UIInterfaceOrientationLandscapeRight = "UIInterfaceOrientationLandscapeRight".asInstanceOf[typings.expoConfigPlugins.expoConfigPluginsStrings.UIInterfaceOrientationLandscapeRight]
    
    inline def UIInterfaceOrientationPortrait: typings.expoConfigPlugins.expoConfigPluginsStrings.UIInterfaceOrientationPortrait = "UIInterfaceOrientationPortrait".asInstanceOf[typings.expoConfigPlugins.expoConfigPluginsStrings.UIInterfaceOrientationPortrait]
    
    inline def UIInterfaceOrientationPortraitUpsideDown: typings.expoConfigPlugins.expoConfigPluginsStrings.UIInterfaceOrientationPortraitUpsideDown = "UIInterfaceOrientationPortraitUpsideDown".asInstanceOf[typings.expoConfigPlugins.expoConfigPluginsStrings.UIInterfaceOrientationPortraitUpsideDown]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expoConfigPlugins.expoConfigPluginsStrings.Light
    - typings.expoConfigPlugins.expoConfigPluginsStrings.Dark
    - typings.expoConfigPlugins.expoConfigPluginsStrings.Automatic
  */
  trait InterfaceStyle extends StObject
  object InterfaceStyle {
    
    inline def Automatic: typings.expoConfigPlugins.expoConfigPluginsStrings.Automatic = "Automatic".asInstanceOf[typings.expoConfigPlugins.expoConfigPluginsStrings.Automatic]
    
    inline def Dark: typings.expoConfigPlugins.expoConfigPluginsStrings.Dark = "Dark".asInstanceOf[typings.expoConfigPlugins.expoConfigPluginsStrings.Dark]
    
    inline def Light: typings.expoConfigPlugins.expoConfigPluginsStrings.Light = "Light".asInstanceOf[typings.expoConfigPlugins.expoConfigPluginsStrings.Light]
  }
  
  trait URLScheme extends StObject {
    
    var CFBundleURLName: js.UndefOr[String] = js.undefined
    
    var CFBundleURLSchemes: js.Array[String]
  }
  object URLScheme {
    
    inline def apply(CFBundleURLSchemes: js.Array[String]): URLScheme = {
      val __obj = js.Dynamic.literal(CFBundleURLSchemes = CFBundleURLSchemes.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLScheme]
    }
    
    extension [Self <: URLScheme](x: Self) {
      
      inline def setCFBundleURLName(value: String): Self = StObject.set(x, "CFBundleURLName", value.asInstanceOf[js.Any])
      
      inline def setCFBundleURLNameUndefined: Self = StObject.set(x, "CFBundleURLName", js.undefined)
      
      inline def setCFBundleURLSchemes(value: js.Array[String]): Self = StObject.set(x, "CFBundleURLSchemes", value.asInstanceOf[js.Any])
      
      inline def setCFBundleURLSchemesVarargs(value: String*): Self = StObject.set(x, "CFBundleURLSchemes", js.Array(value*))
    }
  }
}
