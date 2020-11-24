package typings.frctlFractal.mod

import typings.frctlFractal.anon.Mount
import typings.frctlFractal.anon.Params
import typings.frctlFractal.anon.Path
import typings.frctlFractal.anon.`0`
import typings.frctlFractal.frctlFractalBooleans.`false`
import typings.frctlFractal.frctlFractalStrings.favicon
import typings.frctlFractal.frctlFractalStrings.format
import typings.frctlFractal.frctlFractalStrings.lang
import typings.frctlFractal.frctlFractalStrings.nav
import typings.frctlFractal.frctlFractalStrings.panels
import typings.frctlFractal.frctlFractalStrings.rtl
import typings.frctlFractal.frctlFractalStrings.scripts
import typings.frctlFractal.frctlFractalStrings.skin
import typings.frctlFractal.frctlFractalStrings.static
import typings.frctlFractal.frctlFractalStrings.staticDotmount
import typings.frctlFractal.frctlFractalStrings.styles
import typings.frctlFractal.frctlFractalStrings.version
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.frctlFractal.mod.fractal.core.mixins.Configurable because Inheritance from two classes. Inlined config, config, set, set, get, get */ @JSImport("@frctl/fractal", "WebTheme")
@js.native
class WebTheme protected () extends EventEmitter {
  def this(viewPaths: js.Array[String]) = this()
  def this(viewPaths: js.Array[String], options: WebThemeOptions) = this()
  
  def addLoadPath(path: String): this.type = js.native
  
  def addResolver(handle: String, resolvers: js.Any): this.type = js.native
  
  def addRoute(path: String, opts: `0`): this.type = js.native
  def addRoute(path: String, opts: `0`, resolver: js.Any): this.type = js.native
  
  def addStatic(path: String, mount: String): Unit = js.native
  
  def config(): WebThemeOptions = js.native
  def config(config: WebThemeOptions): this.type = js.native
  
  def errorView(): String = js.native
  
  def get[K /* <: /* keyof T */ String */, V](path: K): js.UndefOr[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
  ] = js.native
  def get[K /* <: /* keyof T */ String */, V](path: K, defaultValue: V): js.UndefOr[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | V | Null
  ] = js.native
  
  @JSName("getOption")
  def getOption_favicon(key: favicon): js.UndefOr[String] = js.native
  @JSName("getOption")
  def getOption_format(key: format): js.UndefOr[String] = js.native
  @JSName("getOption")
  def getOption_lang(key: lang): js.UndefOr[String] = js.native
  @JSName("getOption")
  def getOption_nav(key: nav): js.UndefOr[js.Array[String]] = js.native
  @JSName("getOption")
  def getOption_panels(key: panels): js.UndefOr[js.Array[String]] = js.native
  @JSName("getOption")
  def getOption_rtl(key: rtl): Boolean = js.native
  @JSName("getOption")
  def getOption_scripts(key: scripts): js.UndefOr[js.Array[String]] = js.native
  @JSName("getOption")
  def getOption_skin(key: skin): js.UndefOr[String] = js.native
  @JSName("getOption")
  def getOption_static(key: static): js.UndefOr[Mount] = js.native
  @JSName("getOption")
  def getOption_staticmount(key: staticDotmount): String = js.native
  @JSName("getOption")
  def getOption_styles(key: styles): js.UndefOr[js.Array[String]] = js.native
  @JSName("getOption")
  def getOption_version(key: version): js.UndefOr[String] = js.native
  
  def loadPaths(): js.Array[String] = js.native
  
  def matchRoute(urlPath: String): Params | `false` = js.native
  
  def options(): WebThemeOptions = js.native
  def options(value: WebThemeOptions): this.type = js.native
  
  def redirectView(): String = js.native
  
  def resolvers(): js.Any = js.native
  
  def routes(): js.Array[_] = js.native
  
  def set[K /* <: /* keyof T */ String */](path: K): this.type = js.native
  def set[K /* <: /* keyof T */ String */](
    path: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  
  def setErrorView(view: String): Unit = js.native
  
  @JSName("setOption")
  def setOption_favicon(key: favicon): this.type = js.native
  @JSName("setOption")
  def setOption_favicon(key: favicon, value: String): this.type = js.native
  @JSName("setOption")
  def setOption_format(key: format): this.type = js.native
  @JSName("setOption")
  def setOption_format(key: format, value: String): this.type = js.native
  @JSName("setOption")
  def setOption_lang(key: lang): this.type = js.native
  @JSName("setOption")
  def setOption_lang(key: lang, value: String): this.type = js.native
  @JSName("setOption")
  def setOption_nav(key: nav): this.type = js.native
  @JSName("setOption")
  def setOption_nav(key: nav, value: js.Array[String]): this.type = js.native
  @JSName("setOption")
  def setOption_panels(key: panels): this.type = js.native
  @JSName("setOption")
  def setOption_panels(key: panels, value: js.Array[String]): this.type = js.native
  @JSName("setOption")
  def setOption_rtl(key: rtl, value: Boolean): this.type = js.native
  @JSName("setOption")
  def setOption_scripts(key: scripts): this.type = js.native
  @JSName("setOption")
  def setOption_scripts(key: scripts, value: js.Array[String]): this.type = js.native
  @JSName("setOption")
  def setOption_skin(key: skin): this.type = js.native
  @JSName("setOption")
  def setOption_skin(key: skin, value: String): this.type = js.native
  @JSName("setOption")
  def setOption_static(key: static): this.type = js.native
  @JSName("setOption")
  def setOption_static(key: static, value: Mount): this.type = js.native
  @JSName("setOption")
  def setOption_staticmount(key: staticDotmount, value: String): this.type = js.native
  @JSName("setOption")
  def setOption_styles(key: styles): this.type = js.native
  @JSName("setOption")
  def setOption_styles(key: styles, value: js.Array[String]): this.type = js.native
  @JSName("setOption")
  def setOption_version(key: version): this.type = js.native
  @JSName("setOption")
  def setOption_version(key: version, value: String): this.type = js.native
  
  def setRedirectView(view: String): Unit = js.native
  
  def static(): js.Array[Path] = js.native
  
  def urlFromRoute(handle: String, params: js.Any): String | Null = js.native
  def urlFromRoute(handle: String, params: js.Any, noRedirect: Boolean): String | Null = js.native
}
