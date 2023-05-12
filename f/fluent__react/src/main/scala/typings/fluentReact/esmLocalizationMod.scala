package typings.fluentReact

import typings.fluentBundle.esmBundleMod.FluentVariable
import typings.fluentBundle.mod.FluentBundle
import typings.fluentReact.anon.Attrs
import typings.fluentReact.esmMarkupMod.MarkupParser
import typings.react.mod.ReactElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmLocalizationMod {
  
  @JSImport("@fluent/react/esm/localization", "ReactLocalization")
  @js.native
  open class ReactLocalization protected () extends StObject {
    def this(bundles: js.Iterable[FluentBundle]) = this()
    def this(bundles: js.Iterable[FluentBundle], parseMarkup: MarkupParser) = this()
    
    def areBundlesEmpty(): Boolean = js.native
    
    var bundles: js.Iterable[FluentBundle] = js.native
    
    def getBundle(id: String): FluentBundle | Null = js.native
    
    def getElement(sourceElement: ReactElement, id: String): ReactElement = js.native
    def getElement(sourceElement: ReactElement, id: String, args: Attrs): ReactElement = js.native
    
    def getString(id: String): String = js.native
    def getString(id: String, vars: Null, fallback: String): String = js.native
    def getString(id: String, vars: Unit, fallback: String): String = js.native
    def getString(id: String, vars: Record[String, FluentVariable]): String = js.native
    def getString(id: String, vars: Record[String, FluentVariable], fallback: String): String = js.native
    
    var parseMarkup: MarkupParser | Null = js.native
    
    def reportError(error: js.Error): Unit = js.native
  }
}
