package typings.ecmarkup

import org.scalablytyped.runtime.StringDictionary
import typings.ecmarkup.biblioMod.BiblioEntry
import typings.ecmarkup.specMod.Spec
import typings.std.Node
import typings.std.RegExp
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autolinkerMod {
  
  @JSImport("ecmarkup/lib/autolinker", "NO_CLAUSE_AUTOLINK")
  @js.native
  val NO_CLAUSE_AUTOLINK: Set[String] = js.native
  
  @JSImport("ecmarkup/lib/autolinker", "autolink")
  @js.native
  def autolink(
    node: Node,
    replacer: RegExp,
    autolinkmap: AutoLinkMap,
    clause: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ js.Any,
    currentId: String,
    allowSameId: Boolean
  ): Unit = js.native
  @JSImport("ecmarkup/lib/autolinker", "autolink")
  @js.native
  def autolink(
    node: Node,
    replacer: RegExp,
    autolinkmap: AutoLinkMap,
    clause: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ js.Any,
    currentId: Null,
    allowSameId: Boolean
  ): Unit = js.native
  @JSImport("ecmarkup/lib/autolinker", "autolink")
  @js.native
  def autolink(
    node: Node,
    replacer: RegExp,
    autolinkmap: AutoLinkMap,
    clause: Spec,
    currentId: String,
    allowSameId: Boolean
  ): Unit = js.native
  @JSImport("ecmarkup/lib/autolinker", "autolink")
  @js.native
  def autolink(
    node: Node,
    replacer: RegExp,
    autolinkmap: AutoLinkMap,
    clause: Spec,
    currentId: Null,
    allowSameId: Boolean
  ): Unit = js.native
  
  @JSImport("ecmarkup/lib/autolinker", "replacerForNamespace")
  @js.native
  def replacerForNamespace(
    namespace: String,
    biblio: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Biblio */ js.Any
  ): js.Tuple2[RegExp, AutoLinkMap] = js.native
  
  type AutoLinkMap = StringDictionary[BiblioEntry]
}
