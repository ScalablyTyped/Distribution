package typings.devtools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebDriver {
  
  trait ChromeOptions extends StObject {
    
    /**
      * `devtools` only, switch headless mode by either `headless` flag or `--headless` argument but not both
      */
    var headless: js.UndefOr[Boolean] = js.undefined
  }
  object ChromeOptions {
    
    inline def apply(): ChromeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChromeOptions]
    }
    
    extension [Self <: ChromeOptions](x: Self) {
      
      inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
    }
  }
  
  trait FirefoxOptions extends StObject {
    
    /**
      * `devtools` only, switch headless mode by either `headless` flag or `--headless` argument but not both
      */
    var headless: js.UndefOr[Boolean] = js.undefined
  }
  object FirefoxOptions {
    
    inline def apply(): FirefoxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirefoxOptions]
    }
    
    extension [Self <: FirefoxOptions](x: Self) {
      
      inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
    }
  }
  
  trait MicrosoftEdgeOptions extends StObject {
    
    /**
      * `devtools` only, switch headless mode by either `headless` flag or `--headless` argument but not both
      */
    var headless: js.UndefOr[Boolean] = js.undefined
  }
  object MicrosoftEdgeOptions {
    
    inline def apply(): MicrosoftEdgeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MicrosoftEdgeOptions]
    }
    
    extension [Self <: MicrosoftEdgeOptions](x: Self) {
      
      inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
    }
  }
}
