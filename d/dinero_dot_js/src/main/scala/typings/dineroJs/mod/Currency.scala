package typings.dineroJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ISO 4217 CURRENCY CODES as specified in the documentation
  * Taken from https://www.iso.org/iso-4217-currency-codes.html
  * sorted and parsed
  */
/* Rewritten from type alias, can be one of: 
  - typings.dineroJs.dineroJsStrings.AED
  - typings.dineroJs.dineroJsStrings.AFN
  - typings.dineroJs.dineroJsStrings.ALL
  - typings.dineroJs.dineroJsStrings.AMD
  - typings.dineroJs.dineroJsStrings.ANG
  - typings.dineroJs.dineroJsStrings.AOA
  - typings.dineroJs.dineroJsStrings.ARS
  - typings.dineroJs.dineroJsStrings.AUD
  - typings.dineroJs.dineroJsStrings.AWG
  - typings.dineroJs.dineroJsStrings.AZN
  - typings.dineroJs.dineroJsStrings.BAM
  - typings.dineroJs.dineroJsStrings.BBD
  - typings.dineroJs.dineroJsStrings.BDT
  - typings.dineroJs.dineroJsStrings.BGN
  - typings.dineroJs.dineroJsStrings.BHD
  - typings.dineroJs.dineroJsStrings.BIF
  - typings.dineroJs.dineroJsStrings.BMD
  - typings.dineroJs.dineroJsStrings.BND
  - typings.dineroJs.dineroJsStrings.BOB
  - typings.dineroJs.dineroJsStrings.BOV
  - typings.dineroJs.dineroJsStrings.BRL
  - typings.dineroJs.dineroJsStrings.BSD
  - typings.dineroJs.dineroJsStrings.BTN
  - typings.dineroJs.dineroJsStrings.BWP
  - typings.dineroJs.dineroJsStrings.BYN
  - typings.dineroJs.dineroJsStrings.BZD
  - typings.dineroJs.dineroJsStrings.CAD
  - typings.dineroJs.dineroJsStrings.CDF
  - typings.dineroJs.dineroJsStrings.CHE
  - typings.dineroJs.dineroJsStrings.CHF
  - typings.dineroJs.dineroJsStrings.CHW
  - typings.dineroJs.dineroJsStrings.CLF
  - typings.dineroJs.dineroJsStrings.CLP
  - typings.dineroJs.dineroJsStrings.CNY
  - typings.dineroJs.dineroJsStrings.COP
  - typings.dineroJs.dineroJsStrings.COU
  - typings.dineroJs.dineroJsStrings.CRC
  - typings.dineroJs.dineroJsStrings.CUC
  - typings.dineroJs.dineroJsStrings.CUP
  - typings.dineroJs.dineroJsStrings.CVE
  - typings.dineroJs.dineroJsStrings.CZK
  - typings.dineroJs.dineroJsStrings.DJF
  - typings.dineroJs.dineroJsStrings.DKK
  - typings.dineroJs.dineroJsStrings.DOP
  - typings.dineroJs.dineroJsStrings.DZD
  - typings.dineroJs.dineroJsStrings.EGP
  - typings.dineroJs.dineroJsStrings.ERN
  - typings.dineroJs.dineroJsStrings.ETB
  - typings.dineroJs.dineroJsStrings.EUR
  - typings.dineroJs.dineroJsStrings.FJD
  - typings.dineroJs.dineroJsStrings.FKP
  - typings.dineroJs.dineroJsStrings.GBP
  - typings.dineroJs.dineroJsStrings.GEL
  - typings.dineroJs.dineroJsStrings.GHS
  - typings.dineroJs.dineroJsStrings.GIP
  - typings.dineroJs.dineroJsStrings.GMD
  - typings.dineroJs.dineroJsStrings.GNF
  - typings.dineroJs.dineroJsStrings.GTQ
  - typings.dineroJs.dineroJsStrings.GYD
  - typings.dineroJs.dineroJsStrings.HKD
  - typings.dineroJs.dineroJsStrings.HNL
  - typings.dineroJs.dineroJsStrings.HRK
  - typings.dineroJs.dineroJsStrings.HTG
  - typings.dineroJs.dineroJsStrings.HUF
  - typings.dineroJs.dineroJsStrings.IDR
  - typings.dineroJs.dineroJsStrings.ILS
  - typings.dineroJs.dineroJsStrings.INR
  - typings.dineroJs.dineroJsStrings.IQD
  - typings.dineroJs.dineroJsStrings.IRR
  - typings.dineroJs.dineroJsStrings.ISK
  - typings.dineroJs.dineroJsStrings.JMD
  - typings.dineroJs.dineroJsStrings.JOD
  - typings.dineroJs.dineroJsStrings.JPY
  - typings.dineroJs.dineroJsStrings.KES
  - typings.dineroJs.dineroJsStrings.KGS
  - typings.dineroJs.dineroJsStrings.KHR
  - typings.dineroJs.dineroJsStrings.KMF
  - typings.dineroJs.dineroJsStrings.KPW
  - typings.dineroJs.dineroJsStrings.KRW
  - typings.dineroJs.dineroJsStrings.KWD
  - typings.dineroJs.dineroJsStrings.KYD
  - typings.dineroJs.dineroJsStrings.KZT
  - typings.dineroJs.dineroJsStrings.LAK
  - typings.dineroJs.dineroJsStrings.LBP
  - typings.dineroJs.dineroJsStrings.LKR
  - typings.dineroJs.dineroJsStrings.LRD
  - typings.dineroJs.dineroJsStrings.LSL
  - typings.dineroJs.dineroJsStrings.LYD
  - typings.dineroJs.dineroJsStrings.MAD
  - typings.dineroJs.dineroJsStrings.MDL
  - typings.dineroJs.dineroJsStrings.MGA
  - typings.dineroJs.dineroJsStrings.MKD
  - typings.dineroJs.dineroJsStrings.MMK
  - typings.dineroJs.dineroJsStrings.MNT
  - typings.dineroJs.dineroJsStrings.MOP
  - typings.dineroJs.dineroJsStrings.MRU
  - typings.dineroJs.dineroJsStrings.MUR
  - typings.dineroJs.dineroJsStrings.MVR
  - typings.dineroJs.dineroJsStrings.MWK
  - typings.dineroJs.dineroJsStrings.MXN
  - typings.dineroJs.dineroJsStrings.MXV
  - typings.dineroJs.dineroJsStrings.MYR
  - typings.dineroJs.dineroJsStrings.MZN
  - typings.dineroJs.dineroJsStrings.NAD
  - typings.dineroJs.dineroJsStrings.NGN
  - typings.dineroJs.dineroJsStrings.NIO
  - typings.dineroJs.dineroJsStrings.NOK
  - typings.dineroJs.dineroJsStrings.NPR
  - typings.dineroJs.dineroJsStrings.NZD
  - typings.dineroJs.dineroJsStrings.OMR
  - typings.dineroJs.dineroJsStrings.PAB
  - typings.dineroJs.dineroJsStrings.PEN
  - typings.dineroJs.dineroJsStrings.PGK
  - typings.dineroJs.dineroJsStrings.PHP
  - typings.dineroJs.dineroJsStrings.PKR
  - typings.dineroJs.dineroJsStrings.PLN
  - typings.dineroJs.dineroJsStrings.PYG
  - typings.dineroJs.dineroJsStrings.QAR
  - typings.dineroJs.dineroJsStrings.RON
  - typings.dineroJs.dineroJsStrings.RSD
  - typings.dineroJs.dineroJsStrings.RUB
  - typings.dineroJs.dineroJsStrings.RWF
  - typings.dineroJs.dineroJsStrings.SAR
  - typings.dineroJs.dineroJsStrings.SBD
  - typings.dineroJs.dineroJsStrings.SCR
  - typings.dineroJs.dineroJsStrings.SDG
  - typings.dineroJs.dineroJsStrings.SEK
  - typings.dineroJs.dineroJsStrings.SGD
  - typings.dineroJs.dineroJsStrings.SHP
  - typings.dineroJs.dineroJsStrings.SLL
  - typings.dineroJs.dineroJsStrings.SOS
  - typings.dineroJs.dineroJsStrings.SRD
  - typings.dineroJs.dineroJsStrings.SSP
  - typings.dineroJs.dineroJsStrings.STN
  - typings.dineroJs.dineroJsStrings.SVC
  - typings.dineroJs.dineroJsStrings.SYP
  - typings.dineroJs.dineroJsStrings.SZL
  - typings.dineroJs.dineroJsStrings.THB
  - typings.dineroJs.dineroJsStrings.TJS
  - typings.dineroJs.dineroJsStrings.TMT
  - typings.dineroJs.dineroJsStrings.TND
  - typings.dineroJs.dineroJsStrings.TOP
  - typings.dineroJs.dineroJsStrings.TRY
  - typings.dineroJs.dineroJsStrings.TTD
  - typings.dineroJs.dineroJsStrings.TWD
  - typings.dineroJs.dineroJsStrings.TZS
  - typings.dineroJs.dineroJsStrings.UAH
  - typings.dineroJs.dineroJsStrings.UGX
  - typings.dineroJs.dineroJsStrings.USD
  - typings.dineroJs.dineroJsStrings.USN
  - typings.dineroJs.dineroJsStrings.UYI
  - typings.dineroJs.dineroJsStrings.UYU
  - typings.dineroJs.dineroJsStrings.UYW
  - typings.dineroJs.dineroJsStrings.UZS
  - typings.dineroJs.dineroJsStrings.VES
  - typings.dineroJs.dineroJsStrings.VND
  - typings.dineroJs.dineroJsStrings.VUV
  - typings.dineroJs.dineroJsStrings.WST
  - typings.dineroJs.dineroJsStrings.XAF
  - typings.dineroJs.dineroJsStrings.XAG
  - typings.dineroJs.dineroJsStrings.XAU
  - typings.dineroJs.dineroJsStrings.XBA
  - typings.dineroJs.dineroJsStrings.XBB
  - typings.dineroJs.dineroJsStrings.XBC
  - typings.dineroJs.dineroJsStrings.XBD
  - typings.dineroJs.dineroJsStrings.XCD
  - typings.dineroJs.dineroJsStrings.XDR
  - typings.dineroJs.dineroJsStrings.XOF
  - typings.dineroJs.dineroJsStrings.XPD
  - typings.dineroJs.dineroJsStrings.XPF
  - typings.dineroJs.dineroJsStrings.XPT
  - typings.dineroJs.dineroJsStrings.XSU
  - typings.dineroJs.dineroJsStrings.XTS
  - typings.dineroJs.dineroJsStrings.XUA
  - typings.dineroJs.dineroJsStrings.XXX
  - typings.dineroJs.dineroJsStrings.YER
  - typings.dineroJs.dineroJsStrings.ZAR
  - typings.dineroJs.dineroJsStrings.ZMW
  - typings.dineroJs.dineroJsStrings.ZWL
*/
trait Currency extends js.Object
object Currency {
  
  @scala.inline
  def AED: typings.dineroJs.dineroJsStrings.AED = "AED".asInstanceOf[typings.dineroJs.dineroJsStrings.AED]
  
  @scala.inline
  def AFN: typings.dineroJs.dineroJsStrings.AFN = "AFN".asInstanceOf[typings.dineroJs.dineroJsStrings.AFN]
  
  @scala.inline
  def ALL: typings.dineroJs.dineroJsStrings.ALL = "ALL".asInstanceOf[typings.dineroJs.dineroJsStrings.ALL]
  
  @scala.inline
  def AMD: typings.dineroJs.dineroJsStrings.AMD = "AMD".asInstanceOf[typings.dineroJs.dineroJsStrings.AMD]
  
  @scala.inline
  def ANG: typings.dineroJs.dineroJsStrings.ANG = "ANG".asInstanceOf[typings.dineroJs.dineroJsStrings.ANG]
  
  @scala.inline
  def AOA: typings.dineroJs.dineroJsStrings.AOA = "AOA".asInstanceOf[typings.dineroJs.dineroJsStrings.AOA]
  
  @scala.inline
  def ARS: typings.dineroJs.dineroJsStrings.ARS = "ARS".asInstanceOf[typings.dineroJs.dineroJsStrings.ARS]
  
  @scala.inline
  def AUD: typings.dineroJs.dineroJsStrings.AUD = "AUD".asInstanceOf[typings.dineroJs.dineroJsStrings.AUD]
  
  @scala.inline
  def AWG: typings.dineroJs.dineroJsStrings.AWG = "AWG".asInstanceOf[typings.dineroJs.dineroJsStrings.AWG]
  
  @scala.inline
  def AZN: typings.dineroJs.dineroJsStrings.AZN = "AZN".asInstanceOf[typings.dineroJs.dineroJsStrings.AZN]
  
  @scala.inline
  def BAM: typings.dineroJs.dineroJsStrings.BAM = "BAM".asInstanceOf[typings.dineroJs.dineroJsStrings.BAM]
  
  @scala.inline
  def BBD: typings.dineroJs.dineroJsStrings.BBD = "BBD".asInstanceOf[typings.dineroJs.dineroJsStrings.BBD]
  
  @scala.inline
  def BDT: typings.dineroJs.dineroJsStrings.BDT = "BDT".asInstanceOf[typings.dineroJs.dineroJsStrings.BDT]
  
  @scala.inline
  def BGN: typings.dineroJs.dineroJsStrings.BGN = "BGN".asInstanceOf[typings.dineroJs.dineroJsStrings.BGN]
  
  @scala.inline
  def BHD: typings.dineroJs.dineroJsStrings.BHD = "BHD".asInstanceOf[typings.dineroJs.dineroJsStrings.BHD]
  
  @scala.inline
  def BIF: typings.dineroJs.dineroJsStrings.BIF = "BIF".asInstanceOf[typings.dineroJs.dineroJsStrings.BIF]
  
  @scala.inline
  def BMD: typings.dineroJs.dineroJsStrings.BMD = "BMD".asInstanceOf[typings.dineroJs.dineroJsStrings.BMD]
  
  @scala.inline
  def BND: typings.dineroJs.dineroJsStrings.BND = "BND".asInstanceOf[typings.dineroJs.dineroJsStrings.BND]
  
  @scala.inline
  def BOB: typings.dineroJs.dineroJsStrings.BOB = "BOB".asInstanceOf[typings.dineroJs.dineroJsStrings.BOB]
  
  @scala.inline
  def BOV: typings.dineroJs.dineroJsStrings.BOV = "BOV".asInstanceOf[typings.dineroJs.dineroJsStrings.BOV]
  
  @scala.inline
  def BRL: typings.dineroJs.dineroJsStrings.BRL = "BRL".asInstanceOf[typings.dineroJs.dineroJsStrings.BRL]
  
  @scala.inline
  def BSD: typings.dineroJs.dineroJsStrings.BSD = "BSD".asInstanceOf[typings.dineroJs.dineroJsStrings.BSD]
  
  @scala.inline
  def BTN: typings.dineroJs.dineroJsStrings.BTN = "BTN".asInstanceOf[typings.dineroJs.dineroJsStrings.BTN]
  
  @scala.inline
  def BWP: typings.dineroJs.dineroJsStrings.BWP = "BWP".asInstanceOf[typings.dineroJs.dineroJsStrings.BWP]
  
  @scala.inline
  def BYN: typings.dineroJs.dineroJsStrings.BYN = "BYN".asInstanceOf[typings.dineroJs.dineroJsStrings.BYN]
  
  @scala.inline
  def BZD: typings.dineroJs.dineroJsStrings.BZD = "BZD".asInstanceOf[typings.dineroJs.dineroJsStrings.BZD]
  
  @scala.inline
  def CAD: typings.dineroJs.dineroJsStrings.CAD = "CAD".asInstanceOf[typings.dineroJs.dineroJsStrings.CAD]
  
  @scala.inline
  def CDF: typings.dineroJs.dineroJsStrings.CDF = "CDF".asInstanceOf[typings.dineroJs.dineroJsStrings.CDF]
  
  @scala.inline
  def CHE: typings.dineroJs.dineroJsStrings.CHE = "CHE".asInstanceOf[typings.dineroJs.dineroJsStrings.CHE]
  
  @scala.inline
  def CHF: typings.dineroJs.dineroJsStrings.CHF = "CHF".asInstanceOf[typings.dineroJs.dineroJsStrings.CHF]
  
  @scala.inline
  def CHW: typings.dineroJs.dineroJsStrings.CHW = "CHW".asInstanceOf[typings.dineroJs.dineroJsStrings.CHW]
  
  @scala.inline
  def CLF: typings.dineroJs.dineroJsStrings.CLF = "CLF".asInstanceOf[typings.dineroJs.dineroJsStrings.CLF]
  
  @scala.inline
  def CLP: typings.dineroJs.dineroJsStrings.CLP = "CLP".asInstanceOf[typings.dineroJs.dineroJsStrings.CLP]
  
  @scala.inline
  def CNY: typings.dineroJs.dineroJsStrings.CNY = "CNY".asInstanceOf[typings.dineroJs.dineroJsStrings.CNY]
  
  @scala.inline
  def COP: typings.dineroJs.dineroJsStrings.COP = "COP".asInstanceOf[typings.dineroJs.dineroJsStrings.COP]
  
  @scala.inline
  def COU: typings.dineroJs.dineroJsStrings.COU = "COU".asInstanceOf[typings.dineroJs.dineroJsStrings.COU]
  
  @scala.inline
  def CRC: typings.dineroJs.dineroJsStrings.CRC = "CRC".asInstanceOf[typings.dineroJs.dineroJsStrings.CRC]
  
  @scala.inline
  def CUC: typings.dineroJs.dineroJsStrings.CUC = "CUC".asInstanceOf[typings.dineroJs.dineroJsStrings.CUC]
  
  @scala.inline
  def CUP: typings.dineroJs.dineroJsStrings.CUP = "CUP".asInstanceOf[typings.dineroJs.dineroJsStrings.CUP]
  
  @scala.inline
  def CVE: typings.dineroJs.dineroJsStrings.CVE = "CVE".asInstanceOf[typings.dineroJs.dineroJsStrings.CVE]
  
  @scala.inline
  def CZK: typings.dineroJs.dineroJsStrings.CZK = "CZK".asInstanceOf[typings.dineroJs.dineroJsStrings.CZK]
  
  @scala.inline
  def DJF: typings.dineroJs.dineroJsStrings.DJF = "DJF".asInstanceOf[typings.dineroJs.dineroJsStrings.DJF]
  
  @scala.inline
  def DKK: typings.dineroJs.dineroJsStrings.DKK = "DKK".asInstanceOf[typings.dineroJs.dineroJsStrings.DKK]
  
  @scala.inline
  def DOP: typings.dineroJs.dineroJsStrings.DOP = "DOP".asInstanceOf[typings.dineroJs.dineroJsStrings.DOP]
  
  @scala.inline
  def DZD: typings.dineroJs.dineroJsStrings.DZD = "DZD".asInstanceOf[typings.dineroJs.dineroJsStrings.DZD]
  
  @scala.inline
  def EGP: typings.dineroJs.dineroJsStrings.EGP = "EGP".asInstanceOf[typings.dineroJs.dineroJsStrings.EGP]
  
  @scala.inline
  def ERN: typings.dineroJs.dineroJsStrings.ERN = "ERN".asInstanceOf[typings.dineroJs.dineroJsStrings.ERN]
  
  @scala.inline
  def ETB: typings.dineroJs.dineroJsStrings.ETB = "ETB".asInstanceOf[typings.dineroJs.dineroJsStrings.ETB]
  
  @scala.inline
  def EUR: typings.dineroJs.dineroJsStrings.EUR = "EUR".asInstanceOf[typings.dineroJs.dineroJsStrings.EUR]
  
  @scala.inline
  def FJD: typings.dineroJs.dineroJsStrings.FJD = "FJD".asInstanceOf[typings.dineroJs.dineroJsStrings.FJD]
  
  @scala.inline
  def FKP: typings.dineroJs.dineroJsStrings.FKP = "FKP".asInstanceOf[typings.dineroJs.dineroJsStrings.FKP]
  
  @scala.inline
  def GBP: typings.dineroJs.dineroJsStrings.GBP = "GBP".asInstanceOf[typings.dineroJs.dineroJsStrings.GBP]
  
  @scala.inline
  def GEL: typings.dineroJs.dineroJsStrings.GEL = "GEL".asInstanceOf[typings.dineroJs.dineroJsStrings.GEL]
  
  @scala.inline
  def GHS: typings.dineroJs.dineroJsStrings.GHS = "GHS".asInstanceOf[typings.dineroJs.dineroJsStrings.GHS]
  
  @scala.inline
  def GIP: typings.dineroJs.dineroJsStrings.GIP = "GIP".asInstanceOf[typings.dineroJs.dineroJsStrings.GIP]
  
  @scala.inline
  def GMD: typings.dineroJs.dineroJsStrings.GMD = "GMD".asInstanceOf[typings.dineroJs.dineroJsStrings.GMD]
  
  @scala.inline
  def GNF: typings.dineroJs.dineroJsStrings.GNF = "GNF".asInstanceOf[typings.dineroJs.dineroJsStrings.GNF]
  
  @scala.inline
  def GTQ: typings.dineroJs.dineroJsStrings.GTQ = "GTQ".asInstanceOf[typings.dineroJs.dineroJsStrings.GTQ]
  
  @scala.inline
  def GYD: typings.dineroJs.dineroJsStrings.GYD = "GYD".asInstanceOf[typings.dineroJs.dineroJsStrings.GYD]
  
  @scala.inline
  def HKD: typings.dineroJs.dineroJsStrings.HKD = "HKD".asInstanceOf[typings.dineroJs.dineroJsStrings.HKD]
  
  @scala.inline
  def HNL: typings.dineroJs.dineroJsStrings.HNL = "HNL".asInstanceOf[typings.dineroJs.dineroJsStrings.HNL]
  
  @scala.inline
  def HRK: typings.dineroJs.dineroJsStrings.HRK = "HRK".asInstanceOf[typings.dineroJs.dineroJsStrings.HRK]
  
  @scala.inline
  def HTG: typings.dineroJs.dineroJsStrings.HTG = "HTG".asInstanceOf[typings.dineroJs.dineroJsStrings.HTG]
  
  @scala.inline
  def HUF: typings.dineroJs.dineroJsStrings.HUF = "HUF".asInstanceOf[typings.dineroJs.dineroJsStrings.HUF]
  
  @scala.inline
  def IDR: typings.dineroJs.dineroJsStrings.IDR = "IDR".asInstanceOf[typings.dineroJs.dineroJsStrings.IDR]
  
  @scala.inline
  def ILS: typings.dineroJs.dineroJsStrings.ILS = "ILS".asInstanceOf[typings.dineroJs.dineroJsStrings.ILS]
  
  @scala.inline
  def INR: typings.dineroJs.dineroJsStrings.INR = "INR".asInstanceOf[typings.dineroJs.dineroJsStrings.INR]
  
  @scala.inline
  def IQD: typings.dineroJs.dineroJsStrings.IQD = "IQD".asInstanceOf[typings.dineroJs.dineroJsStrings.IQD]
  
  @scala.inline
  def IRR: typings.dineroJs.dineroJsStrings.IRR = "IRR".asInstanceOf[typings.dineroJs.dineroJsStrings.IRR]
  
  @scala.inline
  def ISK: typings.dineroJs.dineroJsStrings.ISK = "ISK".asInstanceOf[typings.dineroJs.dineroJsStrings.ISK]
  
  @scala.inline
  def JMD: typings.dineroJs.dineroJsStrings.JMD = "JMD".asInstanceOf[typings.dineroJs.dineroJsStrings.JMD]
  
  @scala.inline
  def JOD: typings.dineroJs.dineroJsStrings.JOD = "JOD".asInstanceOf[typings.dineroJs.dineroJsStrings.JOD]
  
  @scala.inline
  def JPY: typings.dineroJs.dineroJsStrings.JPY = "JPY".asInstanceOf[typings.dineroJs.dineroJsStrings.JPY]
  
  @scala.inline
  def KES: typings.dineroJs.dineroJsStrings.KES = "KES".asInstanceOf[typings.dineroJs.dineroJsStrings.KES]
  
  @scala.inline
  def KGS: typings.dineroJs.dineroJsStrings.KGS = "KGS".asInstanceOf[typings.dineroJs.dineroJsStrings.KGS]
  
  @scala.inline
  def KHR: typings.dineroJs.dineroJsStrings.KHR = "KHR".asInstanceOf[typings.dineroJs.dineroJsStrings.KHR]
  
  @scala.inline
  def KMF: typings.dineroJs.dineroJsStrings.KMF = "KMF".asInstanceOf[typings.dineroJs.dineroJsStrings.KMF]
  
  @scala.inline
  def KPW: typings.dineroJs.dineroJsStrings.KPW = "KPW".asInstanceOf[typings.dineroJs.dineroJsStrings.KPW]
  
  @scala.inline
  def KRW: typings.dineroJs.dineroJsStrings.KRW = "KRW".asInstanceOf[typings.dineroJs.dineroJsStrings.KRW]
  
  @scala.inline
  def KWD: typings.dineroJs.dineroJsStrings.KWD = "KWD".asInstanceOf[typings.dineroJs.dineroJsStrings.KWD]
  
  @scala.inline
  def KYD: typings.dineroJs.dineroJsStrings.KYD = "KYD".asInstanceOf[typings.dineroJs.dineroJsStrings.KYD]
  
  @scala.inline
  def KZT: typings.dineroJs.dineroJsStrings.KZT = "KZT".asInstanceOf[typings.dineroJs.dineroJsStrings.KZT]
  
  @scala.inline
  def LAK: typings.dineroJs.dineroJsStrings.LAK = "LAK".asInstanceOf[typings.dineroJs.dineroJsStrings.LAK]
  
  @scala.inline
  def LBP: typings.dineroJs.dineroJsStrings.LBP = "LBP".asInstanceOf[typings.dineroJs.dineroJsStrings.LBP]
  
  @scala.inline
  def LKR: typings.dineroJs.dineroJsStrings.LKR = "LKR".asInstanceOf[typings.dineroJs.dineroJsStrings.LKR]
  
  @scala.inline
  def LRD: typings.dineroJs.dineroJsStrings.LRD = "LRD".asInstanceOf[typings.dineroJs.dineroJsStrings.LRD]
  
  @scala.inline
  def LSL: typings.dineroJs.dineroJsStrings.LSL = "LSL".asInstanceOf[typings.dineroJs.dineroJsStrings.LSL]
  
  @scala.inline
  def LYD: typings.dineroJs.dineroJsStrings.LYD = "LYD".asInstanceOf[typings.dineroJs.dineroJsStrings.LYD]
  
  @scala.inline
  def MAD: typings.dineroJs.dineroJsStrings.MAD = "MAD".asInstanceOf[typings.dineroJs.dineroJsStrings.MAD]
  
  @scala.inline
  def MDL: typings.dineroJs.dineroJsStrings.MDL = "MDL".asInstanceOf[typings.dineroJs.dineroJsStrings.MDL]
  
  @scala.inline
  def MGA: typings.dineroJs.dineroJsStrings.MGA = "MGA".asInstanceOf[typings.dineroJs.dineroJsStrings.MGA]
  
  @scala.inline
  def MKD: typings.dineroJs.dineroJsStrings.MKD = "MKD".asInstanceOf[typings.dineroJs.dineroJsStrings.MKD]
  
  @scala.inline
  def MMK: typings.dineroJs.dineroJsStrings.MMK = "MMK".asInstanceOf[typings.dineroJs.dineroJsStrings.MMK]
  
  @scala.inline
  def MNT: typings.dineroJs.dineroJsStrings.MNT = "MNT".asInstanceOf[typings.dineroJs.dineroJsStrings.MNT]
  
  @scala.inline
  def MOP: typings.dineroJs.dineroJsStrings.MOP = "MOP".asInstanceOf[typings.dineroJs.dineroJsStrings.MOP]
  
  @scala.inline
  def MRU: typings.dineroJs.dineroJsStrings.MRU = "MRU".asInstanceOf[typings.dineroJs.dineroJsStrings.MRU]
  
  @scala.inline
  def MUR: typings.dineroJs.dineroJsStrings.MUR = "MUR".asInstanceOf[typings.dineroJs.dineroJsStrings.MUR]
  
  @scala.inline
  def MVR: typings.dineroJs.dineroJsStrings.MVR = "MVR".asInstanceOf[typings.dineroJs.dineroJsStrings.MVR]
  
  @scala.inline
  def MWK: typings.dineroJs.dineroJsStrings.MWK = "MWK".asInstanceOf[typings.dineroJs.dineroJsStrings.MWK]
  
  @scala.inline
  def MXN: typings.dineroJs.dineroJsStrings.MXN = "MXN".asInstanceOf[typings.dineroJs.dineroJsStrings.MXN]
  
  @scala.inline
  def MXV: typings.dineroJs.dineroJsStrings.MXV = "MXV".asInstanceOf[typings.dineroJs.dineroJsStrings.MXV]
  
  @scala.inline
  def MYR: typings.dineroJs.dineroJsStrings.MYR = "MYR".asInstanceOf[typings.dineroJs.dineroJsStrings.MYR]
  
  @scala.inline
  def MZN: typings.dineroJs.dineroJsStrings.MZN = "MZN".asInstanceOf[typings.dineroJs.dineroJsStrings.MZN]
  
  @scala.inline
  def NAD: typings.dineroJs.dineroJsStrings.NAD = "NAD".asInstanceOf[typings.dineroJs.dineroJsStrings.NAD]
  
  @scala.inline
  def NGN: typings.dineroJs.dineroJsStrings.NGN = "NGN".asInstanceOf[typings.dineroJs.dineroJsStrings.NGN]
  
  @scala.inline
  def NIO: typings.dineroJs.dineroJsStrings.NIO = "NIO".asInstanceOf[typings.dineroJs.dineroJsStrings.NIO]
  
  @scala.inline
  def NOK: typings.dineroJs.dineroJsStrings.NOK = "NOK".asInstanceOf[typings.dineroJs.dineroJsStrings.NOK]
  
  @scala.inline
  def NPR: typings.dineroJs.dineroJsStrings.NPR = "NPR".asInstanceOf[typings.dineroJs.dineroJsStrings.NPR]
  
  @scala.inline
  def NZD: typings.dineroJs.dineroJsStrings.NZD = "NZD".asInstanceOf[typings.dineroJs.dineroJsStrings.NZD]
  
  @scala.inline
  def OMR: typings.dineroJs.dineroJsStrings.OMR = "OMR".asInstanceOf[typings.dineroJs.dineroJsStrings.OMR]
  
  @scala.inline
  def PAB: typings.dineroJs.dineroJsStrings.PAB = "PAB".asInstanceOf[typings.dineroJs.dineroJsStrings.PAB]
  
  @scala.inline
  def PEN: typings.dineroJs.dineroJsStrings.PEN = "PEN".asInstanceOf[typings.dineroJs.dineroJsStrings.PEN]
  
  @scala.inline
  def PGK: typings.dineroJs.dineroJsStrings.PGK = "PGK".asInstanceOf[typings.dineroJs.dineroJsStrings.PGK]
  
  @scala.inline
  def PHP: typings.dineroJs.dineroJsStrings.PHP = "PHP".asInstanceOf[typings.dineroJs.dineroJsStrings.PHP]
  
  @scala.inline
  def PKR: typings.dineroJs.dineroJsStrings.PKR = "PKR".asInstanceOf[typings.dineroJs.dineroJsStrings.PKR]
  
  @scala.inline
  def PLN: typings.dineroJs.dineroJsStrings.PLN = "PLN".asInstanceOf[typings.dineroJs.dineroJsStrings.PLN]
  
  @scala.inline
  def PYG: typings.dineroJs.dineroJsStrings.PYG = "PYG".asInstanceOf[typings.dineroJs.dineroJsStrings.PYG]
  
  @scala.inline
  def QAR: typings.dineroJs.dineroJsStrings.QAR = "QAR".asInstanceOf[typings.dineroJs.dineroJsStrings.QAR]
  
  @scala.inline
  def RON: typings.dineroJs.dineroJsStrings.RON = "RON".asInstanceOf[typings.dineroJs.dineroJsStrings.RON]
  
  @scala.inline
  def RSD: typings.dineroJs.dineroJsStrings.RSD = "RSD".asInstanceOf[typings.dineroJs.dineroJsStrings.RSD]
  
  @scala.inline
  def RUB: typings.dineroJs.dineroJsStrings.RUB = "RUB".asInstanceOf[typings.dineroJs.dineroJsStrings.RUB]
  
  @scala.inline
  def RWF: typings.dineroJs.dineroJsStrings.RWF = "RWF".asInstanceOf[typings.dineroJs.dineroJsStrings.RWF]
  
  @scala.inline
  def SAR: typings.dineroJs.dineroJsStrings.SAR = "SAR".asInstanceOf[typings.dineroJs.dineroJsStrings.SAR]
  
  @scala.inline
  def SBD: typings.dineroJs.dineroJsStrings.SBD = "SBD".asInstanceOf[typings.dineroJs.dineroJsStrings.SBD]
  
  @scala.inline
  def SCR: typings.dineroJs.dineroJsStrings.SCR = "SCR".asInstanceOf[typings.dineroJs.dineroJsStrings.SCR]
  
  @scala.inline
  def SDG: typings.dineroJs.dineroJsStrings.SDG = "SDG".asInstanceOf[typings.dineroJs.dineroJsStrings.SDG]
  
  @scala.inline
  def SEK: typings.dineroJs.dineroJsStrings.SEK = "SEK".asInstanceOf[typings.dineroJs.dineroJsStrings.SEK]
  
  @scala.inline
  def SGD: typings.dineroJs.dineroJsStrings.SGD = "SGD".asInstanceOf[typings.dineroJs.dineroJsStrings.SGD]
  
  @scala.inline
  def SHP: typings.dineroJs.dineroJsStrings.SHP = "SHP".asInstanceOf[typings.dineroJs.dineroJsStrings.SHP]
  
  @scala.inline
  def SLL: typings.dineroJs.dineroJsStrings.SLL = "SLL".asInstanceOf[typings.dineroJs.dineroJsStrings.SLL]
  
  @scala.inline
  def SOS: typings.dineroJs.dineroJsStrings.SOS = "SOS".asInstanceOf[typings.dineroJs.dineroJsStrings.SOS]
  
  @scala.inline
  def SRD: typings.dineroJs.dineroJsStrings.SRD = "SRD".asInstanceOf[typings.dineroJs.dineroJsStrings.SRD]
  
  @scala.inline
  def SSP: typings.dineroJs.dineroJsStrings.SSP = "SSP".asInstanceOf[typings.dineroJs.dineroJsStrings.SSP]
  
  @scala.inline
  def STN: typings.dineroJs.dineroJsStrings.STN = "STN".asInstanceOf[typings.dineroJs.dineroJsStrings.STN]
  
  @scala.inline
  def SVC: typings.dineroJs.dineroJsStrings.SVC = "SVC".asInstanceOf[typings.dineroJs.dineroJsStrings.SVC]
  
  @scala.inline
  def SYP: typings.dineroJs.dineroJsStrings.SYP = "SYP".asInstanceOf[typings.dineroJs.dineroJsStrings.SYP]
  
  @scala.inline
  def SZL: typings.dineroJs.dineroJsStrings.SZL = "SZL".asInstanceOf[typings.dineroJs.dineroJsStrings.SZL]
  
  @scala.inline
  def THB: typings.dineroJs.dineroJsStrings.THB = "THB".asInstanceOf[typings.dineroJs.dineroJsStrings.THB]
  
  @scala.inline
  def TJS: typings.dineroJs.dineroJsStrings.TJS = "TJS".asInstanceOf[typings.dineroJs.dineroJsStrings.TJS]
  
  @scala.inline
  def TMT: typings.dineroJs.dineroJsStrings.TMT = "TMT".asInstanceOf[typings.dineroJs.dineroJsStrings.TMT]
  
  @scala.inline
  def TND: typings.dineroJs.dineroJsStrings.TND = "TND".asInstanceOf[typings.dineroJs.dineroJsStrings.TND]
  
  @scala.inline
  def TOP: typings.dineroJs.dineroJsStrings.TOP = "TOP".asInstanceOf[typings.dineroJs.dineroJsStrings.TOP]
  
  @scala.inline
  def TRY: typings.dineroJs.dineroJsStrings.TRY = "TRY".asInstanceOf[typings.dineroJs.dineroJsStrings.TRY]
  
  @scala.inline
  def TTD: typings.dineroJs.dineroJsStrings.TTD = "TTD".asInstanceOf[typings.dineroJs.dineroJsStrings.TTD]
  
  @scala.inline
  def TWD: typings.dineroJs.dineroJsStrings.TWD = "TWD".asInstanceOf[typings.dineroJs.dineroJsStrings.TWD]
  
  @scala.inline
  def TZS: typings.dineroJs.dineroJsStrings.TZS = "TZS".asInstanceOf[typings.dineroJs.dineroJsStrings.TZS]
  
  @scala.inline
  def UAH: typings.dineroJs.dineroJsStrings.UAH = "UAH".asInstanceOf[typings.dineroJs.dineroJsStrings.UAH]
  
  @scala.inline
  def UGX: typings.dineroJs.dineroJsStrings.UGX = "UGX".asInstanceOf[typings.dineroJs.dineroJsStrings.UGX]
  
  @scala.inline
  def USD: typings.dineroJs.dineroJsStrings.USD = "USD".asInstanceOf[typings.dineroJs.dineroJsStrings.USD]
  
  @scala.inline
  def USN: typings.dineroJs.dineroJsStrings.USN = "USN".asInstanceOf[typings.dineroJs.dineroJsStrings.USN]
  
  @scala.inline
  def UYI: typings.dineroJs.dineroJsStrings.UYI = "UYI".asInstanceOf[typings.dineroJs.dineroJsStrings.UYI]
  
  @scala.inline
  def UYU: typings.dineroJs.dineroJsStrings.UYU = "UYU".asInstanceOf[typings.dineroJs.dineroJsStrings.UYU]
  
  @scala.inline
  def UYW: typings.dineroJs.dineroJsStrings.UYW = "UYW".asInstanceOf[typings.dineroJs.dineroJsStrings.UYW]
  
  @scala.inline
  def UZS: typings.dineroJs.dineroJsStrings.UZS = "UZS".asInstanceOf[typings.dineroJs.dineroJsStrings.UZS]
  
  @scala.inline
  def VES: typings.dineroJs.dineroJsStrings.VES = "VES".asInstanceOf[typings.dineroJs.dineroJsStrings.VES]
  
  @scala.inline
  def VND: typings.dineroJs.dineroJsStrings.VND = "VND".asInstanceOf[typings.dineroJs.dineroJsStrings.VND]
  
  @scala.inline
  def VUV: typings.dineroJs.dineroJsStrings.VUV = "VUV".asInstanceOf[typings.dineroJs.dineroJsStrings.VUV]
  
  @scala.inline
  def WST: typings.dineroJs.dineroJsStrings.WST = "WST".asInstanceOf[typings.dineroJs.dineroJsStrings.WST]
  
  @scala.inline
  def XAF: typings.dineroJs.dineroJsStrings.XAF = "XAF".asInstanceOf[typings.dineroJs.dineroJsStrings.XAF]
  
  @scala.inline
  def XAG: typings.dineroJs.dineroJsStrings.XAG = "XAG".asInstanceOf[typings.dineroJs.dineroJsStrings.XAG]
  
  @scala.inline
  def XAU: typings.dineroJs.dineroJsStrings.XAU = "XAU".asInstanceOf[typings.dineroJs.dineroJsStrings.XAU]
  
  @scala.inline
  def XBA: typings.dineroJs.dineroJsStrings.XBA = "XBA".asInstanceOf[typings.dineroJs.dineroJsStrings.XBA]
  
  @scala.inline
  def XBB: typings.dineroJs.dineroJsStrings.XBB = "XBB".asInstanceOf[typings.dineroJs.dineroJsStrings.XBB]
  
  @scala.inline
  def XBC: typings.dineroJs.dineroJsStrings.XBC = "XBC".asInstanceOf[typings.dineroJs.dineroJsStrings.XBC]
  
  @scala.inline
  def XBD: typings.dineroJs.dineroJsStrings.XBD = "XBD".asInstanceOf[typings.dineroJs.dineroJsStrings.XBD]
  
  @scala.inline
  def XCD: typings.dineroJs.dineroJsStrings.XCD = "XCD".asInstanceOf[typings.dineroJs.dineroJsStrings.XCD]
  
  @scala.inline
  def XDR: typings.dineroJs.dineroJsStrings.XDR = "XDR".asInstanceOf[typings.dineroJs.dineroJsStrings.XDR]
  
  @scala.inline
  def XOF: typings.dineroJs.dineroJsStrings.XOF = "XOF".asInstanceOf[typings.dineroJs.dineroJsStrings.XOF]
  
  @scala.inline
  def XPD: typings.dineroJs.dineroJsStrings.XPD = "XPD".asInstanceOf[typings.dineroJs.dineroJsStrings.XPD]
  
  @scala.inline
  def XPF: typings.dineroJs.dineroJsStrings.XPF = "XPF".asInstanceOf[typings.dineroJs.dineroJsStrings.XPF]
  
  @scala.inline
  def XPT: typings.dineroJs.dineroJsStrings.XPT = "XPT".asInstanceOf[typings.dineroJs.dineroJsStrings.XPT]
  
  @scala.inline
  def XSU: typings.dineroJs.dineroJsStrings.XSU = "XSU".asInstanceOf[typings.dineroJs.dineroJsStrings.XSU]
  
  @scala.inline
  def XTS: typings.dineroJs.dineroJsStrings.XTS = "XTS".asInstanceOf[typings.dineroJs.dineroJsStrings.XTS]
  
  @scala.inline
  def XUA: typings.dineroJs.dineroJsStrings.XUA = "XUA".asInstanceOf[typings.dineroJs.dineroJsStrings.XUA]
  
  @scala.inline
  def XXX: typings.dineroJs.dineroJsStrings.XXX = "XXX".asInstanceOf[typings.dineroJs.dineroJsStrings.XXX]
  
  @scala.inline
  def YER: typings.dineroJs.dineroJsStrings.YER = "YER".asInstanceOf[typings.dineroJs.dineroJsStrings.YER]
  
  @scala.inline
  def ZAR: typings.dineroJs.dineroJsStrings.ZAR = "ZAR".asInstanceOf[typings.dineroJs.dineroJsStrings.ZAR]
  
  @scala.inline
  def ZMW: typings.dineroJs.dineroJsStrings.ZMW = "ZMW".asInstanceOf[typings.dineroJs.dineroJsStrings.ZMW]
  
  @scala.inline
  def ZWL: typings.dineroJs.dineroJsStrings.ZWL = "ZWL".asInstanceOf[typings.dineroJs.dineroJsStrings.ZWL]
}
