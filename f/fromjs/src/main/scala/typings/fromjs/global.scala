package typings.fromjs

import typings.fromjs.FromJS.IQueryable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def from[T](results: js.Array[T]): IQueryable[T] = js.Dynamic.global.applyDynamic("from")(results.asInstanceOf[js.Any]).asInstanceOf[IQueryable[T]]
  inline def from[T](results: Any): IQueryable[Any] = js.Dynamic.global.applyDynamic("from")(results.asInstanceOf[js.Any]).asInstanceOf[IQueryable[Any]]
}
