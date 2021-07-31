package typings.flakeIdgen

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("flake-idgen", JSImport.Namespace)
  @js.native
  class ^ ()
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
    
    @scala.inline
    def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit class ConstructorOptionsMutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDatacenter(value: Double): Self = StObject.set(x, "datacenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatacenterUndefined: Self = StObject.set(x, "datacenter", js.undefined)
      
      @scala.inline
      def setEpoch(value: Double): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEpochUndefined: Self = StObject.set(x, "epoch", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setSeqMask(value: Double): Self = StObject.set(x, "seqMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeqMaskUndefined: Self = StObject.set(x, "seqMask", js.undefined)
      
      @scala.inline
      def setWorker(value: Double): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
    }
  }
  
  @js.native
  trait FlakeId extends StObject {
    
    def next(): Buffer = js.native
    def next(callback: js.Function2[/* err */ Error, /* id */ Buffer, Unit]): Buffer = js.native
  }
}
