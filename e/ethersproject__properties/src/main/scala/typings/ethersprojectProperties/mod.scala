package typings.ethersprojectProperties

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/properties", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def checkProperties(`object`: js.Any, properties: StringDictionary[Boolean]): Unit = js.native
  
  def deepCopy[T](`object`: T): T = js.native
  
  def defineReadOnly[T, K /* <: /* keyof T */ String */](
    `object`: T,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): Unit = js.native
  
  def getStatic[T](ctor: js.Any, key: String): T = js.native
  
  def resolveProperties[T](`object`: Deferrable[T]): js.Promise[T] = js.native
  
  def shallowCopy[T](`object`: T): T = js.native
  
  @js.native
  class Description[T] protected () extends js.Object {
    def this(info: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]: T[K]}
      */ typings.ethersprojectProperties.ethersprojectPropertiesStrings.Description with TopLevel[T]) = this()
  }
  
  type Deferrable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] | std.Promise<T[K]>}
    */ typings.ethersprojectProperties.ethersprojectPropertiesStrings.Deferrable with TopLevel[js.Any]
}
