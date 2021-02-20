package typings.dva

import typings.dva.dvaStrings.hashbang
import typings.dva.dvaStrings.noslash
import typings.dva.dvaStrings.slash
import typings.dva.mod.EffectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<react-router-dom.react-router-dom.BrowserRouterProps> */
  @js.native
  trait ReadonlyBrowserRouterProp extends StObject {
    
    val basename: js.UndefOr[String] = js.native
    
    val forceRefresh: js.UndefOr[Boolean] = js.native
    
    val getUserConfirmation: js.UndefOr[
        js.Function2[/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit], Unit]
      ] = js.native
    
    val keyLength: js.UndefOr[Double] = js.native
  }
  object ReadonlyBrowserRouterProp {
    
    @scala.inline
    def apply(): ReadonlyBrowserRouterProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyBrowserRouterProp]
    }
    
    @scala.inline
    implicit class ReadonlyBrowserRouterPropMutableBuilder[Self <: ReadonlyBrowserRouterProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      @scala.inline
      def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
      
      @scala.inline
      def setGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit): Self = StObject.set(x, "getUserConfirmation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
      
      @scala.inline
      def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<react-router-dom.react-router-dom.HashRouterProps> */
  @js.native
  trait ReadonlyHashRouterProps extends StObject {
    
    val basename: js.UndefOr[String] = js.native
    
    val getUserConfirmation: js.UndefOr[
        js.Function2[/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit], Unit]
      ] = js.native
    
    val hashType: js.UndefOr[slash | noslash | hashbang] = js.native
  }
  object ReadonlyHashRouterProps {
    
    @scala.inline
    def apply(): ReadonlyHashRouterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyHashRouterProps]
    }
    
    @scala.inline
    implicit class ReadonlyHashRouterPropsMutableBuilder[Self <: ReadonlyHashRouterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      @scala.inline
      def setGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit): Self = StObject.set(x, "getUserConfirmation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
      
      @scala.inline
      def setHashType(value: slash | noslash | hashbang): Self = StObject.set(x, "hashType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashTypeUndefined: Self = StObject.set(x, "hashType", js.undefined)
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var `type`: EffectType = js.native
  }
  object Type {
    
    @scala.inline
    def apply(`type`: EffectType): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: EffectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
