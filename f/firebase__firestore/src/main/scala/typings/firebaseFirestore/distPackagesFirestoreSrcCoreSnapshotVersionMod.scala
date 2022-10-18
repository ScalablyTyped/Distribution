package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiTimestampMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcCoreSnapshotVersionMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/snapshot_version", "SnapshotVersion")
  @js.native
  /* private */ open class SnapshotVersion () extends StObject {
    
    def compareTo(other: SnapshotVersion): Double = js.native
    
    def isEqual(other: SnapshotVersion): Boolean = js.native
    
    /* private */ var timestamp: Any = js.native
    
    /** Returns a number representation of the version for use in spec tests. */
    def toMicroseconds(): Double = js.native
    
    def toTimestamp(): Timestamp = js.native
  }
  /* static members */
  object SnapshotVersion {
    
    @JSImport("@firebase/firestore/dist/packages/firestore/src/core/snapshot_version", "SnapshotVersion")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromTimestamp(value: Timestamp): SnapshotVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTimestamp")(value.asInstanceOf[js.Any]).asInstanceOf[SnapshotVersion]
    
    inline def max(): SnapshotVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[SnapshotVersion]
    
    inline def min(): SnapshotVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[SnapshotVersion]
  }
}
