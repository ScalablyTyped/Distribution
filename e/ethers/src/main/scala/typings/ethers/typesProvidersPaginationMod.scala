package typings.ethers

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersPaginationMod {
  
  @js.native
  trait PaginationResult[R]
    extends StObject
       with Array[R] {
    
    var done: Boolean = js.native
    
    def next(): js.Promise[PaginationResult[R]] = js.native
    
    var totalResults: Null | Double = js.native
  }
}
