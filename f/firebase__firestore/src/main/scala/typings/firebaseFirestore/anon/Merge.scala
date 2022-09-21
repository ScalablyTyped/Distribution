package typings.firebaseFirestore.anon

import typings.firebaseFirestore.mod.SetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Merge
  extends StObject
     with SetOptions
     with typings.firebaseFirestore.packagesFirestoreSrcLiteApiReferenceMod.SetOptions
     with typings.firebaseFirestore.distLiteMod.SetOptions
     with typings.firebaseFirestore.liteInternalMod.SetOptions
     with typings.firebaseFirestore.firestoreSrcLiteApiReferenceMod.SetOptions
     with typings.firebaseFirestore.srcLiteApiReferenceMod.SetOptions
     with typings.firebaseFirestore.distPrivateMod.SetOptions
     with typings.firebaseFirestore.privateMod.SetOptions
     with typings.firebaseFirestore.internalMod.SetOptions
     with typings.firebaseFirestore.liteApiReferenceMod.SetOptions {
  
  val merge: js.UndefOr[Boolean] = js.undefined
}
object Merge {
  
  inline def apply(): Merge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Merge]
  }
  
  extension [Self <: Merge](x: Self) {
    
    inline def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
  }
}
