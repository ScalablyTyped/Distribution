package typings.googleMaps

import typings.googleMaps.mod.CallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object GoogleMapsLoader {
    
    @JSGlobal("GoogleMapsLoader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("GoogleMapsLoader.CHANNEL")
    @js.native
    def CHANNEL: String = js.native
    inline def CHANNEL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHANNEL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("GoogleMapsLoader.CLIENT")
    @js.native
    def CLIENT: String = js.native
    inline def CLIENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT")(x.asInstanceOf[js.Any])
    
    @JSGlobal("GoogleMapsLoader.KEY")
    @js.native
    def KEY: String = js.native
    inline def KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KEY")(x.asInstanceOf[js.Any])
    
    @JSGlobal("GoogleMapsLoader.LANGUAGE")
    @js.native
    def LANGUAGE: String = js.native
    inline def LANGUAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LANGUAGE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("GoogleMapsLoader.LIBRARIES")
    @js.native
    def LIBRARIES: js.Array[String] = js.native
    inline def LIBRARIES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIBRARIES")(x.asInstanceOf[js.Any])
    
    @JSGlobal("GoogleMapsLoader.REGION")
    @js.native
    def REGION: String = js.native
    inline def REGION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGION")(x.asInstanceOf[js.Any])
    
    @JSGlobal("GoogleMapsLoader.URL")
    @js.native
    def URL: String = js.native
    inline def URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("GoogleMapsLoader.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    @JSGlobal("GoogleMapsLoader.WINDOW_CALLBACK_NAME")
    @js.native
    def WINDOW_CALLBACK_NAME: String = js.native
    inline def WINDOW_CALLBACK_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOW_CALLBACK_NAME")(x.asInstanceOf[js.Any])
    
    inline def createLoader(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoader")().asInstanceOf[Unit]
    
    inline def createUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createUrl")().asInstanceOf[String]
    
    inline def isLoaded(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoaded")().asInstanceOf[Boolean]
    
    inline def load(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")().asInstanceOf[Unit]
    inline def load(callBack: CallBack): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(callBack.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def makeMock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMock")().asInstanceOf[Unit]
    
    inline def onLoad(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLoad")().asInstanceOf[Unit]
    inline def onLoad(callBack: CallBack): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLoad")(callBack.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def release(callBack: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("release")(callBack.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
