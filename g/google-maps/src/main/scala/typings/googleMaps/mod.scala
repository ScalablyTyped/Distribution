package typings.googleMaps

import typings.googleMaps.anon.Typeofmaps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("google-maps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("google-maps", "CHANNEL")
  @js.native
  def CHANNEL: String = js.native
  @scala.inline
  def CHANNEL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHANNEL")(x.asInstanceOf[js.Any])
  
  @JSImport("google-maps", "CLIENT")
  @js.native
  def CLIENT: String = js.native
  @scala.inline
  def CLIENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT")(x.asInstanceOf[js.Any])
  
  @JSImport("google-maps", "KEY")
  @js.native
  def KEY: String = js.native
  @scala.inline
  def KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEY")(x.asInstanceOf[js.Any])
  
  @JSImport("google-maps", "LANGUAGE")
  @js.native
  def LANGUAGE: String = js.native
  @scala.inline
  def LANGUAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LANGUAGE")(x.asInstanceOf[js.Any])
  
  @JSImport("google-maps", "LIBRARIES")
  @js.native
  def LIBRARIES: js.Array[String] = js.native
  @scala.inline
  def LIBRARIES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIBRARIES")(x.asInstanceOf[js.Any])
  
  @JSImport("google-maps", "REGION")
  @js.native
  def REGION: String = js.native
  @scala.inline
  def REGION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGION")(x.asInstanceOf[js.Any])
  
  @JSImport("google-maps", "URL")
  @js.native
  def URL: String = js.native
  @scala.inline
  def URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
  
  @JSImport("google-maps", "VERSION")
  @js.native
  def VERSION: String = js.native
  @scala.inline
  def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  
  @JSImport("google-maps", "WINDOW_CALLBACK_NAME")
  @js.native
  def WINDOW_CALLBACK_NAME: String = js.native
  @scala.inline
  def WINDOW_CALLBACK_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOW_CALLBACK_NAME")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def createLoader(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoader")().asInstanceOf[Unit]
  
  @scala.inline
  def createUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createUrl")().asInstanceOf[String]
  
  @scala.inline
  def isLoaded(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoaded")().asInstanceOf[Boolean]
  
  @scala.inline
  def load(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")().asInstanceOf[Unit]
  @scala.inline
  def load(callBack: CallBack): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(callBack.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def makeMock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMock")().asInstanceOf[Unit]
  
  @scala.inline
  def onLoad(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLoad")().asInstanceOf[Unit]
  @scala.inline
  def onLoad(callBack: CallBack): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLoad")(callBack.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def release(callBack: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("release")(callBack.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type CallBack = js.Function1[/* google */ google, Unit]
  
  trait google extends StObject {
    
    var maps: Typeofmaps
  }
  object google {
    
    @scala.inline
    def apply(maps: Typeofmaps): google = {
      val __obj = js.Dynamic.literal(maps = maps.asInstanceOf[js.Any])
      __obj.asInstanceOf[google]
    }
    
    @scala.inline
    implicit class googleMutableBuilder[Self <: google] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaps(value: Typeofmaps): Self = StObject.set(x, "maps", value.asInstanceOf[js.Any])
    }
  }
}
