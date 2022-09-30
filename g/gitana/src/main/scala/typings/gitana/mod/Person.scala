package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Person")
@js.native
open class Person protected () extends StObject {
  def this(branch: Any, `object`: Any) = this()
  
  def base(): Unit = js.native
  
  def getAddress(): Any = js.native
  
  def getCity(): Any = js.native
  
  def getCompanyName(): Any = js.native
  
  def getEmail(): Any = js.native
  
  def getFirstName(): Any = js.native
  
  def getJobTitle(): Any = js.native
  
  def getLastName(): Any = js.native
  
  def getPhoneNumber(): Any = js.native
  
  def getPrincipalDomainId(): Any = js.native
  
  def getPrincipalId(): Any = js.native
  
  def getPrincipalName(): Any = js.native
  
  def getPrincipalType(): Any = js.native
  
  def getState(): Any = js.native
  
  def getZipcode(): Any = js.native
  
  def readPrincipal(): Any = js.native
  
  def setAddress(address: Any): Unit = js.native
  
  def setCity(city: Any): Unit = js.native
  
  def setCompanyName(companyName: Any): Unit = js.native
  
  def setEmail(email: Any): Unit = js.native
  
  def setFirstName(firstName: Any): Unit = js.native
  
  def setJobTitle(jobTitle: Any): Unit = js.native
  
  def setLastName(lastName: Any): Unit = js.native
  
  def setPhoneNumber(phoneNumber: Any): Unit = js.native
  
  def setState(state: Any): Unit = js.native
  
  def setZipcode(zipcode: Any): Unit = js.native
}
object Person {
  
  @JSImport("gitana", "Person")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(_instance: Any, _static: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((scala.List(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  /* static member */
  inline def forEach(`object`: Any, block: Any, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /* static member */
  inline def toString_(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[Any]
  
  /* static member */
  inline def valueOf_(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
