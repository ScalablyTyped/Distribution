package typings.firebaseDatabase.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.firebaseDatabase.internalMod.QueryContext because Already inherited
- typings.firebaseDatabase.internalMod.Query_ because Already inherited
- typings.firebaseDatabase.internalMod.DatabaseReference because var conflicts: _queryIdentifier, _queryObject, key, ref. Inlined parent, root */ @JSImport("@firebase/database/dist/internal", "_ReferenceImpl")
@js.native
open class ReferenceImpl protected () extends QueryImpl {
  /** @hideconstructor */
  def this(repo: Repo, path: Path) = this()
  
  def parent: ReferenceImpl | Null = js.native
  /**
    * The parent location of a `DatabaseReference`.
    *
    * The parent of a root `DatabaseReference` is `null`.
    */
  @JSName("parent")
  val parent_FReferenceImpl: DatabaseReference | Null = js.native
  
  def root: ReferenceImpl = js.native
  /** The root `DatabaseReference` of the Database. */
  @JSName("root")
  val root_FReferenceImpl: DatabaseReference = js.native
}
