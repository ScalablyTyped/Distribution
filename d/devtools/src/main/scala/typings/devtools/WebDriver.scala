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
    
    @scala.inline
    def apply(): ChromeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChromeOptions]
    }
    
    @scala.inline
    implicit class ChromeOptionsMutableBuilder[Self <: ChromeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
    }
  }
  
  trait FirefoxOptions extends StObject {
    
    /**
      * `devtools` only, switch headless mode by either `headless` flag or `--headless` argument but not both
      */
    var headless: js.UndefOr[Boolean] = js.undefined
  }
  object FirefoxOptions {
    
    @scala.inline
    def apply(): FirefoxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirefoxOptions]
    }
    
    @scala.inline
    implicit class FirefoxOptionsMutableBuilder[Self <: FirefoxOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
    }
  }
  
  trait MicrosoftEdgeOptions extends StObject {
    
    /**
      * `devtools` only, switch headless mode by either `headless` flag or `--headless` argument but not both
      */
    var headless: js.UndefOr[Boolean] = js.undefined
  }
  object MicrosoftEdgeOptions {
    
    @scala.inline
    def apply(): MicrosoftEdgeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MicrosoftEdgeOptions]
    }
    
    @scala.inline
    implicit class MicrosoftEdgeOptionsMutableBuilder[Self <: MicrosoftEdgeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
    }
  }
}
