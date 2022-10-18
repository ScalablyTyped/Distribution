package typings.ecmarkup

import org.scalablytyped.runtime.StringDictionary
import typings.ecmarkup.anon.Autolinkmap
import typings.ecmarkup.libBiblioMod.BiblioEntry
import typings.ecmarkup.libSpecMod.Spec
import typings.std.Node
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAutolinkerMod {
  
  @JSImport("ecmarkup/lib/autolinker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ecmarkup/lib/autolinker", "NO_CLAUSE_AUTOLINK")
  @js.native
  val NO_CLAUSE_AUTOLINK: Set[String] = js.native
  
  @JSImport("ecmarkup/lib/autolinker", "YES_CLAUSE_AUTOLINK")
  @js.native
  val YES_CLAUSE_AUTOLINK: Set[String] = js.native
  
  inline def autolink(
    node: Node,
    replacer: js.RegExp,
    autolinkmap: AutoLinkMap,
    clause: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ Any,
    currentId: String,
    allowSameId: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autolink")(node.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], autolinkmap.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], currentId.asInstanceOf[js.Any], allowSameId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def autolink(
    node: Node,
    replacer: js.RegExp,
    autolinkmap: AutoLinkMap,
    clause: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ Any,
    currentId: Null,
    allowSameId: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autolink")(node.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], autolinkmap.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], currentId.asInstanceOf[js.Any], allowSameId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def autolink(
    node: Node,
    replacer: js.RegExp,
    autolinkmap: AutoLinkMap,
    clause: Spec,
    currentId: String,
    allowSameId: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autolink")(node.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], autolinkmap.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], currentId.asInstanceOf[js.Any], allowSameId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def autolink(
    node: Node,
    replacer: js.RegExp,
    autolinkmap: AutoLinkMap,
    clause: Spec,
    currentId: Null,
    allowSameId: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autolink")(node.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], autolinkmap.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], currentId.asInstanceOf[js.Any], allowSameId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def replacerForNamespace(
    namespace: String,
    biblio: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Biblio */ Any
  ): Autolinkmap = (^.asInstanceOf[js.Dynamic].applyDynamic("replacerForNamespace")(namespace.asInstanceOf[js.Any], biblio.asInstanceOf[js.Any])).asInstanceOf[Autolinkmap]
  
  type AutoLinkMap = StringDictionary[BiblioEntry]
}
