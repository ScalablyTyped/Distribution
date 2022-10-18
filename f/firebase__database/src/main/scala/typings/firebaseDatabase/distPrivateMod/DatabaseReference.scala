package typings.firebaseDatabase.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseReference
  extends StObject
     with Query_ {
  
  /**
    * The last part of the `DatabaseReference`'s path.
    *
    * For example, `"ada"` is the key for
    * `https://<DATABASE_NAME>.firebaseio.com/users/ada`.
    *
    * The key of a root `DatabaseReference` is `null`.
    */
  val key: String | Null = js.native
  
  /**
    * The parent location of a `DatabaseReference`.
    *
    * The parent of a root `DatabaseReference` is `null`.
    */
  val parent: DatabaseReference | Null = js.native
  
  /** The root `DatabaseReference` of the Database. */
  val root: DatabaseReference = js.native
}
