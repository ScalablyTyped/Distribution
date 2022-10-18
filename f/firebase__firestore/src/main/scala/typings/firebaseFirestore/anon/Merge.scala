package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.SetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Merge
  extends StObject
     with SetOptions
     with typings.firebaseFirestore.mod.SetOptions
     with typings.firebaseFirestore.distLiteInternalMod.SetOptions
     with typings.firebaseFirestore.distInternalMod.SetOptions
     with typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.SetOptions
     with typings.firebaseFirestore.distLiteMod.SetOptions
     with typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.SetOptions
     with typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.SetOptions
     with typings.firebaseFirestore.distLitePrivateMod.SetOptions
     with typings.firebaseFirestore.distPrivateMod.SetOptions {
  
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
