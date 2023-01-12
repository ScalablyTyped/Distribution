package typings.fileSize

import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: Options */](bytes: Double): Required[T] & Result = ^.asInstanceOf[js.Dynamic].apply(bytes.asInstanceOf[js.Any]).asInstanceOf[Required[T] & Result]
  inline def apply[T /* <: Options */](bytes: Double, options: T): Required[T] & Result = (^.asInstanceOf[js.Dynamic].apply(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Required[T] & Result]
  
  @JSImport("file-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Bits extends StObject {
    
    var fixed: String
    
    var result: Double
  }
  object Bits {
    
    inline def apply(fixed: String, result: Double): Bits = {
      val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bits]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bits] (val x: Self) extends AnyVal {
      
      inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Double): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Calculated extends StObject {
    
    var bits: Bits
    
    var fixed: String
    
    var magnitude: Double
    
    var result: Double
    
    var suffix: String
  }
  object Calculated {
    
    inline def apply(bits: Bits, fixed: String, magnitude: Double, result: Double, suffix: String): Calculated = {
      val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], magnitude = magnitude.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Calculated]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Calculated] (val x: Self) extends AnyVal {
      
      inline def setBits(value: Bits): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Double): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var fixed: js.UndefOr[Double] = js.undefined
    
    var spacer: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setFixed(value: Double): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setSpacer(value: String): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
      
      inline def setSpacerUndefined: Self = StObject.set(x, "spacer", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    def calculate(): Calculated = js.native
    def calculate(spec: Spec): Calculated = js.native
    
    def human(): String = js.native
    def human(spec: Spec): String = js.native
    
    def to(unit: Unit): String = js.native
    def to(unit: Unit, spec: Spec): String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fileSize.fileSizeStrings.si
    - typings.fileSize.fileSizeStrings.iec
    - typings.fileSize.fileSizeStrings.jedec
  */
  trait Spec extends StObject
  object Spec {
    
    inline def iec: typings.fileSize.fileSizeStrings.iec = "iec".asInstanceOf[typings.fileSize.fileSizeStrings.iec]
    
    inline def jedec: typings.fileSize.fileSizeStrings.jedec = "jedec".asInstanceOf[typings.fileSize.fileSizeStrings.jedec]
    
    inline def si: typings.fileSize.fileSizeStrings.si = "si".asInstanceOf[typings.fileSize.fileSizeStrings.si]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fileSize.fileSizeStrings.B
    - typings.fileSize.fileSizeStrings.KB
    - typings.fileSize.fileSizeStrings.MB
    - typings.fileSize.fileSizeStrings.GB
    - typings.fileSize.fileSizeStrings.TB
    - typings.fileSize.fileSizeStrings.PB
    - typings.fileSize.fileSizeStrings.EB
    - typings.fileSize.fileSizeStrings.ZB
    - typings.fileSize.fileSizeStrings.YB
  */
  trait Unit extends StObject
  object Unit {
    
    inline def B: typings.fileSize.fileSizeStrings.B = "B".asInstanceOf[typings.fileSize.fileSizeStrings.B]
    
    inline def EB: typings.fileSize.fileSizeStrings.EB = "EB".asInstanceOf[typings.fileSize.fileSizeStrings.EB]
    
    inline def GB: typings.fileSize.fileSizeStrings.GB = "GB".asInstanceOf[typings.fileSize.fileSizeStrings.GB]
    
    inline def KB: typings.fileSize.fileSizeStrings.KB = "KB".asInstanceOf[typings.fileSize.fileSizeStrings.KB]
    
    inline def MB: typings.fileSize.fileSizeStrings.MB = "MB".asInstanceOf[typings.fileSize.fileSizeStrings.MB]
    
    inline def PB: typings.fileSize.fileSizeStrings.PB = "PB".asInstanceOf[typings.fileSize.fileSizeStrings.PB]
    
    inline def TB: typings.fileSize.fileSizeStrings.TB = "TB".asInstanceOf[typings.fileSize.fileSizeStrings.TB]
    
    inline def YB: typings.fileSize.fileSizeStrings.YB = "YB".asInstanceOf[typings.fileSize.fileSizeStrings.YB]
    
    inline def ZB: typings.fileSize.fileSizeStrings.ZB = "ZB".asInstanceOf[typings.fileSize.fileSizeStrings.ZB]
  }
}
