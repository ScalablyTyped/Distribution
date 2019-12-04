package typings.ecmarkup

import org.scalablytyped.runtime.StringDictionary
import typings.ecmarkup.libAutolinkerMod.AutoLinkMap
import typings.ecmarkup.libBiblioMod.BiblioEntry
import typings.ecmarkup.libSpecMod.Spec
import typings.std.Node
import typings.std.RegExp
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup/lib/autolinker", JSImport.Namespace)
@js.native
object libAutolinkerMod extends js.Object {
  val NO_CLAUSE_AUTOLINK: Set[String] = js.native
  def autolink(
    node: Node,
    replacer: RegExp,
    autolinkmap: AutoLinkMap,
    clause: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ js.Any,
    currentId: String,
    allowSameId: Boolean
  ): Unit = js.native
  def autolink(
    node: Node,
    replacer: RegExp,
    autolinkmap: AutoLinkMap,
    clause: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ js.Any,
    currentId: Null,
    allowSameId: Boolean
  ): Unit = js.native
  def autolink(
    node: Node,
    replacer: RegExp,
    autolinkmap: AutoLinkMap,
    clause: Spec,
    currentId: String,
    allowSameId: Boolean
  ): Unit = js.native
  def autolink(
    node: Node,
    replacer: RegExp,
    autolinkmap: AutoLinkMap,
    clause: Spec,
    currentId: Null,
    allowSameId: Boolean
  ): Unit = js.native
  def replacerForNamespace(
    namespace: String,
    biblio: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Biblio */ js.Any
  ): js.Tuple2[RegExp, AutoLinkMap] = js.native
  type AutoLinkMap = StringDictionary[BiblioEntry]
}

