package typings.flakeIdgen

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("flake-idgen", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FlakeId {
    def this(options: ConstructorOptions) = this()
  }
  
  trait ConstructorOptions extends StObject {
    
    var datacenter: js.UndefOr[Double] = js.undefined
    
    var epoch: js.UndefOr[Double] = js.undefined
    
    var id: js.UndefOr[Double] = js.undefined
    
    var seqMask: js.UndefOr[Double] = js.undefined
    
    var worker: js.UndefOr[Double] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setDatacenter(value: Double): Self = StObject.set(x, "datacenter", value.asInstanceOf[js.Any])
      
      inline def setDatacenterUndefined: Self = StObject.set(x, "datacenter", js.undefined)
      
      inline def setEpoch(value: Double): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
      
      inline def setEpochUndefined: Self = StObject.set(x, "epoch", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setSeqMask(value: Double): Self = StObject.set(x, "seqMask", value.asInstanceOf[js.Any])
      
      inline def setSeqMaskUndefined: Self = StObject.set(x, "seqMask", js.undefined)
      
      inline def setWorker(value: Double): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
    }
  }
  
  @js.native
  trait FlakeId extends StObject {
    
    def next(): Buffer = js.native
    def next(callback: js.Function2[/* err */ js.Error, /* id */ Buffer, Unit]): Buffer = js.native
  }
}
