package typings.ecmarkup

import org.scalablytyped.runtime.StringDictionary
import typings.ecmarkup.biblioMod.BiblioEntry
import typings.ecmarkup.specMod.Spec
import typings.std.Node
import typings.std.RegExp
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autolinkerMod {
  
  @JSImport("ecmarkup/lib/autolinker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ecmarkup/lib/autolinker", "NO_CLAUSE_AUTOLINK")
  @js.native
  val NO_CLAUSE_AUTOLINK: Set[String] = js.native
  
  @scala.inline
  def autolink(
    node: Node,
    replacer: RegExp,
    autolinkmap: AutoLinkMap,
    clause: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ js.Any,
    currentId: String,
    allowSameId: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autolink")(node.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], autolinkmap.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], currentId.asInstanceOf[js.Any], allowSameId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def autolink(
    node: Node,
    replacer: RegExp,
    autolinkmap: AutoLinkMap,
    clause: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ js.Any,
    currentId: Null,
    allowSameId: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autolink")(node.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], autolinkmap.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], currentId.asInstanceOf[js.Any], allowSameId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def autolink(
    node: Node,
    replacer: RegExp,
    autolinkmap: AutoLinkMap,
    clause: Spec,
    currentId: String,
    allowSameId: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autolink")(node.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], autolinkmap.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], currentId.asInstanceOf[js.Any], allowSameId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def autolink(
    node: Node,
    replacer: RegExp,
    autolinkmap: AutoLinkMap,
    clause: Spec,
    currentId: Null,
    allowSameId: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autolink")(node.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], autolinkmap.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], currentId.asInstanceOf[js.Any], allowSameId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def replacerForNamespace(
    namespace: String,
    biblio: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Biblio */ js.Any
  ): js.Tuple2[RegExp, AutoLinkMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("replacerForNamespace")(namespace.asInstanceOf[js.Any], biblio.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[RegExp, AutoLinkMap]]
  
  type AutoLinkMap = StringDictionary[BiblioEntry]
}
