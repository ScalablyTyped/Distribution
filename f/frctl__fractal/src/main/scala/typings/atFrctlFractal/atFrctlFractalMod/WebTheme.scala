package typings.atFrctlFractal.atFrctlFractalMod

import typings.atFrctlFractal.Anon_HandleString
import typings.atFrctlFractal.Anon_Mount
import typings.atFrctlFractal.Anon_MountPath
import typings.atFrctlFractal.Anon_Params
import typings.atFrctlFractal.atFrctlFractalBooleans.`false`
import typings.atFrctlFractal.atFrctlFractalStrings.favicon
import typings.atFrctlFractal.atFrctlFractalStrings.format
import typings.atFrctlFractal.atFrctlFractalStrings.lang
import typings.atFrctlFractal.atFrctlFractalStrings.nav
import typings.atFrctlFractal.atFrctlFractalStrings.panels
import typings.atFrctlFractal.atFrctlFractalStrings.rtl
import typings.atFrctlFractal.atFrctlFractalStrings.scripts
import typings.atFrctlFractal.atFrctlFractalStrings.skin
import typings.atFrctlFractal.atFrctlFractalStrings.static
import typings.atFrctlFractal.atFrctlFractalStrings.staticDotmount
import typings.atFrctlFractal.atFrctlFractalStrings.styles
import typings.atFrctlFractal.atFrctlFractalStrings.version
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atFrctlFractal.atFrctlFractalMod.fractal.core.mixins.Configurable because Inheritance from two classes. Inlined config, config, set, set, get, get */ @JSImport("@frctl/fractal", "WebTheme")
@js.native
class WebTheme protected () extends EventEmitter {
  def this(viewPaths: js.Array[String]) = this()
  def this(viewPaths: js.Array[String], options: WebThemeOptions) = this()
  def addLoadPath(path: String): this.type = js.native
  def addResolver(handle: String, resolvers: js.Any): this.type = js.native
  def addRoute(path: String, opts: Anon_HandleString): this.type = js.native
  def addRoute(path: String, opts: Anon_HandleString, resolver: js.Any): this.type = js.native
  def addStatic(path: String, mount: String): Unit = js.native
  def config(): WebThemeOptions = js.native
  def config(config: WebThemeOptions): this.type = js.native
  def errorView(): String = js.native
  def get[K /* <: String */, V](path: K): js.UndefOr[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
  ] = js.native
  def get[K /* <: String */, V](path: K, defaultValue: V): js.UndefOr[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
  ] = js.native
  @JSName("getOption")
  def getOption_favicon(key: favicon): String = js.native
  @JSName("getOption")
  def getOption_format(key: format): String = js.native
  @JSName("getOption")
  def getOption_lang(key: lang): String = js.native
  @JSName("getOption")
  def getOption_nav(key: nav): js.Array[String] = js.native
  @JSName("getOption")
  def getOption_panels(key: panels): js.Array[String] = js.native
  @JSName("getOption")
  def getOption_rtl(key: rtl): Boolean = js.native
  @JSName("getOption")
  def getOption_scripts(key: scripts): js.Array[String] = js.native
  @JSName("getOption")
  def getOption_skin(key: skin): String = js.native
  @JSName("getOption")
  def getOption_static(key: static): Anon_Mount = js.native
  @JSName("getOption")
  def getOption_staticmount(key: staticDotmount): String = js.native
  @JSName("getOption")
  def getOption_styles(key: styles): js.Array[String] = js.native
  @JSName("getOption")
  def getOption_version(key: version): String = js.native
  def loadPaths(): js.Array[String] = js.native
  def matchRoute(urlPath: String): Anon_Params | `false` = js.native
  def options(): WebThemeOptions = js.native
  def options(value: WebThemeOptions): this.type = js.native
  def redirectView(): String = js.native
  def resolvers(): js.Any = js.native
  def routes(): js.Array[_] = js.native
  def set[K /* <: String */](path: K): this.type = js.native
  def set[K /* <: String */](
    path: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def setErrorView(view: String): Unit = js.native
  @JSName("setOption")
  def setOption_favicon(key: favicon, value: String): this.type = js.native
  @JSName("setOption")
  def setOption_format(key: format, value: String): this.type = js.native
  @JSName("setOption")
  def setOption_lang(key: lang, value: String): this.type = js.native
  @JSName("setOption")
  def setOption_nav(key: nav, value: js.Array[String]): this.type = js.native
  @JSName("setOption")
  def setOption_panels(key: panels, value: js.Array[String]): this.type = js.native
  @JSName("setOption")
  def setOption_rtl(key: rtl, value: Boolean): this.type = js.native
  @JSName("setOption")
  def setOption_scripts(key: scripts, value: js.Array[String]): this.type = js.native
  @JSName("setOption")
  def setOption_skin(key: skin, value: String): this.type = js.native
  @JSName("setOption")
  def setOption_static(key: static, value: Anon_Mount): this.type = js.native
  @JSName("setOption")
  def setOption_staticmount(key: staticDotmount, value: String): this.type = js.native
  @JSName("setOption")
  def setOption_styles(key: styles, value: js.Array[String]): this.type = js.native
  @JSName("setOption")
  def setOption_version(key: version, value: String): this.type = js.native
  def setRedirectView(view: String): Unit = js.native
  def static(): js.Array[Anon_MountPath] = js.native
  def urlFromRoute(handle: String, params: js.Any): String | Null = js.native
  def urlFromRoute(handle: String, params: js.Any, noRedirect: Boolean): String | Null = js.native
}

