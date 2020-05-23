package typings.ethersprojectProperties

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ethersproject/properties", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Description[T] protected () extends js.Object {
    def this(info: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]: T[K]}
      */ typings.ethersprojectProperties.ethersprojectPropertiesStrings.Description with TopLevel[T]) = this()
  }
  
  def checkProperties(`object`: js.Any, properties: StringDictionary[Boolean]): Unit = js.native
  def deepCopy[T](`object`: T): Similar[T] = js.native
  def defineReadOnly[T, K /* <: /* keyof T */ String */](
    `object`: T,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): Unit = js.native
  def getStatic[T](ctor: js.Any, key: String): T = js.native
  def resolveProperties[T](`object`: Resolvable[T]): js.Promise[Similar[T]] = js.native
  def shallowCopy[T](`object`: T): Similar[T] = js.native
  type Resolvable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | std.Promise<T[P]>}
    */ typings.ethersprojectProperties.ethersprojectPropertiesStrings.Resolvable with TopLevel[js.Any]
  type Similar[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P]}
    */ typings.ethersprojectProperties.ethersprojectPropertiesStrings.Similar with TopLevel[T]
}

