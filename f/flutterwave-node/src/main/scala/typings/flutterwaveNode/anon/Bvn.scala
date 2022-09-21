package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bvn extends StObject {
  
  var bvn: String
  
  var date_of_birth: String
  
  var enrollment_bank: String
  
  var enrollment_branch: String
  
  var first_name: String
  
  var last_name: String
  
  var middle_name: String
  
  var phone_number: String
  
  var registration_date: String
}
object Bvn {
  
  inline def apply(
    bvn: String,
    date_of_birth: String,
    enrollment_bank: String,
    enrollment_branch: String,
    first_name: String,
    last_name: String,
    middle_name: String,
    phone_number: String,
    registration_date: String
  ): Bvn = {
    val __obj = js.Dynamic.literal(bvn = bvn.asInstanceOf[js.Any], date_of_birth = date_of_birth.asInstanceOf[js.Any], enrollment_bank = enrollment_bank.asInstanceOf[js.Any], enrollment_branch = enrollment_branch.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], middle_name = middle_name.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], registration_date = registration_date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bvn]
  }
  
  extension [Self <: Bvn](x: Self) {
    
    inline def setBvn(value: String): Self = StObject.set(x, "bvn", value.asInstanceOf[js.Any])
    
    inline def setDate_of_birth(value: String): Self = StObject.set(x, "date_of_birth", value.asInstanceOf[js.Any])
    
    inline def setEnrollment_bank(value: String): Self = StObject.set(x, "enrollment_bank", value.asInstanceOf[js.Any])
    
    inline def setEnrollment_branch(value: String): Self = StObject.set(x, "enrollment_branch", value.asInstanceOf[js.Any])
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setMiddle_name(value: String): Self = StObject.set(x, "middle_name", value.asInstanceOf[js.Any])
    
    inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setRegistration_date(value: String): Self = StObject.set(x, "registration_date", value.asInstanceOf[js.Any])
  }
}
