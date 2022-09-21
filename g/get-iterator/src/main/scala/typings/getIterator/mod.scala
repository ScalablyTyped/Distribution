package typings.getIterator

import typings.std.AsyncIterable
import typings.std.AsyncIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("get-iterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIterator[T](obj: js.Iterable[T]): js.Iterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIterator")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Iterator[T]]
  inline def getIterator[T](obj: js.Iterator[T]): js.Iterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIterator")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Iterator[T]]
  inline def getIterator[T](obj: Any): (AsyncIterator[T, Any, Unit]) | js.Iterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIterator")(obj.asInstanceOf[js.Any]).asInstanceOf[(AsyncIterator[T, Any, Unit]) | js.Iterator[T]]
  inline def getIterator[T](obj: AsyncIterable[T]): AsyncIterator[T, Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIterator")(obj.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[T, Any, Unit]]
  inline def getIterator[T](obj: AsyncIterator[T, Any, Unit]): AsyncIterator[T, Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIterator")(obj.asInstanceOf[js.Any]).asInstanceOf[AsyncIterator[T, Any, Unit]]
}
