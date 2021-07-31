package typings.faviconsWebpackPlugin

import typings.faviconsWebpackPlugin.anon.MainTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compatMod {
  
  @JSImport("favicons-webpack-plugin/src/compat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getAssetPath(hasMainTemplate: MainTemplate, name: js.Any, args: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAssetPath")(hasMainTemplate.asInstanceOf[js.Any], name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getContext(loader: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(loader.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def tap(tappable: js.Any, hook: js.Any, name: js.Any, plugin: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(tappable.asInstanceOf[js.Any], hook.asInstanceOf[js.Any], name.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def tapHtml(tappable: js.Any, name: js.Any, plugin: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("tapHtml")(tappable.asInstanceOf[js.Any], name.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
