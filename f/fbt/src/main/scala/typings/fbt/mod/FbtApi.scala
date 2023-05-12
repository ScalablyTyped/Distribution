package typings.fbt.mod

import org.scalablytyped.runtime.StringDictionary
import typings.fbt.anon.Fbt
import typings.fbt.fbtStrings.END_TO_END
import typings.fbt.fbtStrings.END_TO_START
import typings.fbt.fbtStrings.START_TO_END
import typings.fbt.fbtStrings.START_TO_START
import typings.fbt.fbtStrings.cloneContents
import typings.fbt.fbtStrings.cloneRange
import typings.fbt.fbtStrings.collapse
import typings.fbt.fbtStrings.collapsed
import typings.fbt.fbtStrings.commonAncestorContainer
import typings.fbt.fbtStrings.compareBoundaryPoints
import typings.fbt.fbtStrings.comparePoint
import typings.fbt.fbtStrings.createContextualFragment
import typings.fbt.fbtStrings.deleteContents
import typings.fbt.fbtStrings.detach
import typings.fbt.fbtStrings.endContainer
import typings.fbt.fbtStrings.endOffset
import typings.fbt.fbtStrings.extractContents
import typings.fbt.fbtStrings.getBoundingClientRect
import typings.fbt.fbtStrings.getClientRects
import typings.fbt.fbtStrings.insertNode
import typings.fbt.fbtStrings.intersectsNode
import typings.fbt.fbtStrings.isPointInRange
import typings.fbt.fbtStrings.selectNode
import typings.fbt.fbtStrings.selectNodeContents
import typings.fbt.fbtStrings.setEnd
import typings.fbt.fbtStrings.setEndAfter
import typings.fbt.fbtStrings.setEndBefore
import typings.fbt.fbtStrings.setStart
import typings.fbt.fbtStrings.setStartAfter
import typings.fbt.fbtStrings.setStartBefore
import typings.fbt.fbtStrings.startContainer
import typings.fbt.fbtStrings.startOffset
import typings.fbt.fbtStrings.surroundContents
import typings.fbt.fbtStrings.toString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FbtApi[Output /* <: Fbt */] extends StObject {
  
  def apply(text: String, description: String): /* import warning: importer.ImportType#apply Failed type conversion: Output['fbt'] */ js.Any = js.native
  def apply(text: String, description: String, options: FbtOptions): /* import warning: importer.ImportType#apply Failed type conversion: Output['fbt'] */ js.Any = js.native
  def apply(text: js.Array[String], description: String): /* import warning: importer.ImportType#apply Failed type conversion: Output['fbt'] */ js.Any = js.native
  def apply(text: js.Array[String], description: String, options: FbtOptions): /* import warning: importer.ImportType#apply Failed type conversion: Output['fbt'] */ js.Any = js.native
  
  //
  /**
    * To use the strings at runtime, there is the `fbt.c(...)` function call or the <fbt common=true>...</fbt> JSX API.
    * NOTE: The transform will throw if it encounters a common string not in the map provided.
    * https://facebook.github.io/fbt/docs/common#runtime-api
    */
  def c(text: String): /* import warning: importer.ImportType#apply Failed type conversion: Output['fbt'] */ js.Any = js.native
  
  // Only used in React Native in fbsource
  def disableJsonExportMode(): Unit = js.native
  
  // https://github.com/facebook/fbt/blob/d14af3e7dcf775562d4c4d27e62861bd9394ea6b/runtime/shared/fbt.js#L453-L455
  // Only used in React Native in fbsource
  def enableJsonExportMode(): Unit = js.native
  
  def `enum`(index: String, range: js.Array[String]): /* import warning: importer.ImportType#apply Failed type conversion: Output['params'] */ js.Any = js.native
  def `enum`[Range /* <: StringDictionary[String] */](
    enumKey: /* keyof Range */ commonAncestorContainer | cloneContents | cloneRange | collapse | compareBoundaryPoints | comparePoint | createContextualFragment | deleteContents | detach | extractContents | getBoundingClientRect | getClientRects | insertNode | intersectsNode | isPointInRange | selectNode | selectNodeContents | setEnd | setEndAfter | setEndBefore | setStart | setStartAfter | setStartBefore | surroundContents | toString | START_TO_START | START_TO_END | END_TO_END | END_TO_START | collapsed | endContainer | endOffset | startContainer | startOffset,
    enumRange: Range
  ): /* import warning: importer.ImportType#apply Failed type conversion: Output['params'] */ js.Any = js.native
  
  def isFbtInstance(value: Any): Boolean = js.native
  
  def name(tokenName: String, value: Any, gender: IntlVariationsGender): /* import warning: importer.ImportType#apply Failed type conversion: Output['params'] */ js.Any = js.native
  
  def param(name: String, value: Any): /* import warning: importer.ImportType#apply Failed type conversion: Output['params'] */ js.Any = js.native
  def param(name: String, value: Any, options: ParamOptions): /* import warning: importer.ImportType#apply Failed type conversion: Output['params'] */ js.Any = js.native
  
  def plural(singularPhrase: String, count: Double): /* import warning: importer.ImportType#apply Failed type conversion: Output['params'] */ js.Any = js.native
  def plural(singularPhrase: String, count: Double, options: PluralOptions): /* import warning: importer.ImportType#apply Failed type conversion: Output['params'] */ js.Any = js.native
  
  def pronoun(`type`: PronounType, gender: GenderConst): /* import warning: importer.ImportType#apply Failed type conversion: Output['params'] */ js.Any = js.native
  def pronoun(`type`: PronounType, gender: GenderConst, options: PronounOptions): /* import warning: importer.ImportType#apply Failed type conversion: Output['params'] */ js.Any = js.native
  
  def sameParam(name: String): /* import warning: importer.ImportType#apply Failed type conversion: Output['params'] */ js.Any = js.native
}
