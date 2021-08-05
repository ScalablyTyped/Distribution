package typings.devtools.anon

import typings.node.processMod.global.NodeJS.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserName extends StObject {
  
  var browserName: String
  
  var browserVersion: String
  
  var platformName: Platform
  
  var platformVersion: String
}
object BrowserName {
  
  inline def apply(browserName: String, browserVersion: String, platformName: Platform, platformVersion: String): BrowserName = {
    val __obj = js.Dynamic.literal(browserName = browserName.asInstanceOf[js.Any], browserVersion = browserVersion.asInstanceOf[js.Any], platformName = platformName.asInstanceOf[js.Any], platformVersion = platformVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserName]
  }
  
  extension [Self <: BrowserName](x: Self) {
    
    inline def setBrowserName(value: String): Self = StObject.set(x, "browserName", value.asInstanceOf[js.Any])
    
    inline def setBrowserVersion(value: String): Self = StObject.set(x, "browserVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformName(value: Platform): Self = StObject.set(x, "platformName", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
  }
}
