package typings.ethers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsDataMod {
  
  @JSImport("ethers/types/utils/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concat(datas: js.Array[BytesLike]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(datas.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dataLength(data: BytesLike): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dataLength")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def dataSlice(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dataSlice")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def dataSlice(data: BytesLike, start: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dataSlice")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def dataSlice(data: BytesLike, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dataSlice")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def dataSlice(data: BytesLike, start: Unit, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dataSlice")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getBytes(value: BytesLike): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def getBytes(value: BytesLike, name: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getBytes")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def getBytesCopy(value: BytesLike): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getBytesCopy")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def getBytesCopy(value: BytesLike, name: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getBytesCopy")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def hexlify(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isBytesLike(value: Any): /* is ethers.ethers/types/utils/data.BytesLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBytesLike")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/utils/data.BytesLike */ Boolean]
  
  inline def isHexString(value: Any): /* is / * template literal string: 0x${string} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: 0x${string} * / string */ Boolean]
  inline def isHexString(value: Any, length: Boolean): /* is / * template literal string: 0x${string} * / string */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[/* is / * template literal string: 0x${string} * / string */ Boolean]
  inline def isHexString(value: Any, length: Double): /* is / * template literal string: 0x${string} * / string */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[/* is / * template literal string: 0x${string} * / string */ Boolean]
  
  inline def stripZerosLeft(data: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripZerosLeft")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def zeroPadBytes(data: BytesLike, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("zeroPadBytes")(data.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def zeroPadValue(data: BytesLike, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("zeroPadValue")(data.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type BytesLike = DataHexString | js.typedarray.Uint8Array
  
  type DataHexString = String
  
  type HexString = String
}
