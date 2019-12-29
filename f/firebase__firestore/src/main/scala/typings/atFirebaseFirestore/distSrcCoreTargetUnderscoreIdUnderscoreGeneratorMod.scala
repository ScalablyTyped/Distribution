package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcCoreTypesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/target_id_generator", JSImport.Namespace)
@js.native
object distSrcCoreTargetUnderscoreIdUnderscoreGeneratorMod extends js.Object {
  @js.native
  class TargetIdGenerator protected () extends js.Object {
    /**
      * Instantiates a new TargetIdGenerator. If a seed is provided, the generator
      * will use the seed value as the next target ID.
      */
    def this(generatorId: Double) = this()
    def this(generatorId: Double, seed: Double) = this()
    var generatorId: js.Any = js.native
    var nextId: js.Any = js.native
    var seek: js.Any = js.native
    /**
      * Returns the ID that follows the given ID. Subsequent calls to `next()`
      * use the newly returned target ID as their base.
      */
    def after(targetId: TargetId): TargetId = js.native
    def next(): TargetId = js.native
  }
  
  /* static members */
  @js.native
  object TargetIdGenerator extends js.Object {
    def forSyncEngine(): TargetIdGenerator = js.native
    def forTargetCache(): TargetIdGenerator = js.native
  }
  
}

