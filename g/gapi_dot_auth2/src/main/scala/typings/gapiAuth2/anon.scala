package typings.gapiAuth2

import typings.gapiAuth2.gapi.auth2.GoogleUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Apppackagename extends StObject {
    
    /**
      * The package name of the Android app to install over the air. See
      * <a href="https://developers.google.com/identity/sign-in/web/android-app-installs">Android app installs from your web site</a>.
      * Optional. (default: none)
      */
    var app_package_name: js.UndefOr[String] = js.native
    
    /**
      * The height of the button in pixels (default: 36).
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * Display long labels such as "Sign in with Google" rather than "Sign in" (default: false).
      */
    var longtitle: js.UndefOr[Boolean] = js.native
    
    /**
      * The callback function to call when sign-in fails (default: none).
      */
    var onfailure: js.UndefOr[js.Function1[/* reason */ Error, Unit]] = js.native
    
    /**
      * The callback function to call when a user successfully signs in (default: none).
      */
    var onsuccess: js.UndefOr[js.Function1[/* user */ GoogleUser, Unit]] = js.native
    
    /**
      * The auth scope or scopes to authorize. Auth scopes for individual APIs can be found in their documentation.
      */
    var scope: js.UndefOr[String] = js.native
    
    /**
      * The color theme of the button: either light or dark (default: light).
      */
    var theme: js.UndefOr[String] = js.native
    
    /**
      * The width of the button in pixels (default: 120).
      */
    var width: js.UndefOr[Double] = js.native
  }
  object Apppackagename {
    
    @scala.inline
    def apply(): Apppackagename = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Apppackagename]
    }
    
    @scala.inline
    implicit class ApppackagenameMutableBuilder[Self <: Apppackagename] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp_package_name(value: String): Self = StObject.set(x, "app_package_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApp_package_nameUndefined: Self = StObject.set(x, "app_package_name", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLongtitle(value: Boolean): Self = StObject.set(x, "longtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongtitleUndefined: Self = StObject.set(x, "longtitle", js.undefined)
      
      @scala.inline
      def setOnfailure(value: /* reason */ Error => Unit): Self = StObject.set(x, "onfailure", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnfailureUndefined: Self = StObject.set(x, "onfailure", js.undefined)
      
      @scala.inline
      def setOnsuccess(value: /* user */ GoogleUser => Unit): Self = StObject.set(x, "onsuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnsuccessUndefined: Self = StObject.set(x, "onsuccess", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Code extends StObject {
    
    var code: String = js.native
  }
  object Code {
    
    @scala.inline
    def apply(code: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Details extends StObject {
    
    var details: String = js.native
    
    var error: String = js.native
  }
  object Details {
    
    @scala.inline
    def apply(details: String, error: String): Details = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Details]
    }
    
    @scala.inline
    implicit class DetailsMutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Error extends StObject {
    
    var error: String = js.native
  }
  object Error {
    
    @scala.inline
    def apply(error: String): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
}
