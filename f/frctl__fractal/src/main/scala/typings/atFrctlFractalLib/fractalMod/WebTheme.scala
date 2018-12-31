package typings
package atFrctlFractalLib.fractalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "WebTheme")
@js.native
class WebTheme protected ()
  extends atFrctlFractalLib.fractalMod.fractalNs.coreNs.mixinsNs.ConfigurableEmitter[WebThemeOptions] {
  def this(viewPaths: js.Array[java.lang.String]) = this()
  def this(viewPaths: js.Array[java.lang.String], options: WebThemeOptions) = this()
  def addLoadPath(path: java.lang.String): this.type = js.native
  def addResolver(handle: java.lang.String, resolvers: js.Any): this.type = js.native
  def addRoute(path: java.lang.String, opts: atFrctlFractalLib.Anon_HandleString): this.type = js.native
  def addRoute(path: java.lang.String, opts: atFrctlFractalLib.Anon_HandleString, resolver: js.Any): this.type = js.native
  def addStatic(path: java.lang.String, mount: java.lang.String): scala.Unit = js.native
  def errorView(): java.lang.String = js.native
  @JSName("getOption")
  def getOption_favicon(key: atFrctlFractalLib.atFrctlFractalLibStrings.favicon): java.lang.String = js.native
  @JSName("getOption")
  def getOption_format(key: atFrctlFractalLib.atFrctlFractalLibStrings.format): java.lang.String = js.native
  @JSName("getOption")
  def getOption_lang(key: atFrctlFractalLib.atFrctlFractalLibStrings.lang): java.lang.String = js.native
  @JSName("getOption")
  def getOption_nav(key: atFrctlFractalLib.atFrctlFractalLibStrings.nav): js.Array[java.lang.String] = js.native
  @JSName("getOption")
  def getOption_panels(key: atFrctlFractalLib.atFrctlFractalLibStrings.panels): js.Array[java.lang.String] = js.native
  @JSName("getOption")
  def getOption_rtl(key: atFrctlFractalLib.atFrctlFractalLibStrings.rtl): scala.Boolean = js.native
  @JSName("getOption")
  def getOption_scripts(key: atFrctlFractalLib.atFrctlFractalLibStrings.scripts): js.Array[java.lang.String] = js.native
  @JSName("getOption")
  def getOption_skin(key: atFrctlFractalLib.atFrctlFractalLibStrings.skin): java.lang.String = js.native
  @JSName("getOption")
  def getOption_static(key: atFrctlFractalLib.atFrctlFractalLibStrings.static): atFrctlFractalLib.Anon_Mount = js.native
  @JSName("getOption")
  def getOption_staticmount(key: atFrctlFractalLib.atFrctlFractalLibStrings.staticDOTmount): java.lang.String = js.native
  @JSName("getOption")
  def getOption_styles(key: atFrctlFractalLib.atFrctlFractalLibStrings.styles): js.Array[java.lang.String] = js.native
  @JSName("getOption")
  def getOption_version(key: atFrctlFractalLib.atFrctlFractalLibStrings.version): java.lang.String = js.native
  def loadPaths(): js.Array[java.lang.String] = js.native
  def matchRoute(urlPath: java.lang.String): atFrctlFractalLib.Anon_Route | atFrctlFractalLib.atFrctlFractalLibNumbers.`false` = js.native
  def options(): WebThemeOptions = js.native
  def options(value: WebThemeOptions): this.type = js.native
  def redirectView(): java.lang.String = js.native
  def resolvers(): js.Any = js.native
  def routes(): js.Array[_] = js.native
  def setErrorView(view: java.lang.String): scala.Unit = js.native
  @JSName("setOption")
  def setOption_favicon(key: atFrctlFractalLib.atFrctlFractalLibStrings.favicon, value: java.lang.String): this.type = js.native
  @JSName("setOption")
  def setOption_format(key: atFrctlFractalLib.atFrctlFractalLibStrings.format, value: java.lang.String): this.type = js.native
  @JSName("setOption")
  def setOption_lang(key: atFrctlFractalLib.atFrctlFractalLibStrings.lang, value: java.lang.String): this.type = js.native
  @JSName("setOption")
  def setOption_nav(key: atFrctlFractalLib.atFrctlFractalLibStrings.nav, value: js.Array[java.lang.String]): this.type = js.native
  @JSName("setOption")
  def setOption_panels(key: atFrctlFractalLib.atFrctlFractalLibStrings.panels, value: js.Array[java.lang.String]): this.type = js.native
  @JSName("setOption")
  def setOption_rtl(key: atFrctlFractalLib.atFrctlFractalLibStrings.rtl, value: scala.Boolean): this.type = js.native
  @JSName("setOption")
  def setOption_scripts(key: atFrctlFractalLib.atFrctlFractalLibStrings.scripts, value: js.Array[java.lang.String]): this.type = js.native
  @JSName("setOption")
  def setOption_skin(key: atFrctlFractalLib.atFrctlFractalLibStrings.skin, value: java.lang.String): this.type = js.native
  @JSName("setOption")
  def setOption_static(key: atFrctlFractalLib.atFrctlFractalLibStrings.static, value: atFrctlFractalLib.Anon_Mount): this.type = js.native
  @JSName("setOption")
  def setOption_staticmount(key: atFrctlFractalLib.atFrctlFractalLibStrings.staticDOTmount, value: java.lang.String): this.type = js.native
  @JSName("setOption")
  def setOption_styles(key: atFrctlFractalLib.atFrctlFractalLibStrings.styles, value: js.Array[java.lang.String]): this.type = js.native
  @JSName("setOption")
  def setOption_version(key: atFrctlFractalLib.atFrctlFractalLibStrings.version, value: java.lang.String): this.type = js.native
  def setRedirectView(view: java.lang.String): scala.Unit = js.native
  def static(): js.Array[atFrctlFractalLib.Anon_MountPath] = js.native
  def urlFromRoute(handle: java.lang.String, params: js.Any): java.lang.String | scala.Null = js.native
  def urlFromRoute(handle: java.lang.String, params: js.Any, noRedirect: scala.Boolean): java.lang.String | scala.Null = js.native
}

