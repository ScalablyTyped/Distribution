package typings.googleapisCommon

import typings.googleapisCommon.schemaMod.HttpMethod
import typings.googleapisCommon.schemaMod.SchemaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleapisCommonStrings {
  
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @scala.inline
  def int32: int32 = "int32".asInstanceOf[int32]
  
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait GET extends HttpMethod
  
  @js.native
  sealed trait PATCH extends HttpMethod
  
  @js.native
  sealed trait PUT extends HttpMethod
  
  @js.native
  sealed trait array extends SchemaType
  
  @js.native
  sealed trait boolean extends SchemaType
  
  @js.native
  sealed trait int32 extends js.Object
  
  @js.native
  sealed trait integer extends SchemaType
  
  @js.native
  sealed trait `object` extends SchemaType
  
  @js.native
  sealed trait string extends SchemaType
}
