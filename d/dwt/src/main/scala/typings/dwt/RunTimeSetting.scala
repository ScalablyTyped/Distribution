package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunTimeSetting extends js.Object {
  var mAntiDamageLevel: Double
  var mBarcodeFormatIds: Double
  var mBarcodeInvertMode: Double
  var mBinarizationBlockSize: Double
  var mColourImageConvertMode: Double
  var mDeblurLevel: Double
  var mEnableFillBinaryVacancy: Double
  var mExpectedBarcodesCount: Double
  var mGrayEqualizationSensitivity: Double
  var mLocalizationAlgorithmPriority: String
  var mMaxAlgorithmThreadCount: Double
  var mMaxBarcodesCount: Double
  var mMaxDimOfFullImageAsBarcodeZone: Double
  var mPDFRasterDPI: Double
  var mRegionPredetectionMode: Double
  var mReserved: String
  var mScaleDownThreshold: Double
  var mTextFilterMode: Double
  var mTextureDetectionSensitivity: Double
  var mTimeout: Double
}

object RunTimeSetting {
  @scala.inline
  def apply(
    mAntiDamageLevel: Double,
    mBarcodeFormatIds: Double,
    mBarcodeInvertMode: Double,
    mBinarizationBlockSize: Double,
    mColourImageConvertMode: Double,
    mDeblurLevel: Double,
    mEnableFillBinaryVacancy: Double,
    mExpectedBarcodesCount: Double,
    mGrayEqualizationSensitivity: Double,
    mLocalizationAlgorithmPriority: String,
    mMaxAlgorithmThreadCount: Double,
    mMaxBarcodesCount: Double,
    mMaxDimOfFullImageAsBarcodeZone: Double,
    mPDFRasterDPI: Double,
    mRegionPredetectionMode: Double,
    mReserved: String,
    mScaleDownThreshold: Double,
    mTextFilterMode: Double,
    mTextureDetectionSensitivity: Double,
    mTimeout: Double
  ): RunTimeSetting = {
    val __obj = js.Dynamic.literal(mAntiDamageLevel = mAntiDamageLevel, mBarcodeFormatIds = mBarcodeFormatIds, mBarcodeInvertMode = mBarcodeInvertMode, mBinarizationBlockSize = mBinarizationBlockSize, mColourImageConvertMode = mColourImageConvertMode, mDeblurLevel = mDeblurLevel, mEnableFillBinaryVacancy = mEnableFillBinaryVacancy, mExpectedBarcodesCount = mExpectedBarcodesCount, mGrayEqualizationSensitivity = mGrayEqualizationSensitivity, mLocalizationAlgorithmPriority = mLocalizationAlgorithmPriority, mMaxAlgorithmThreadCount = mMaxAlgorithmThreadCount, mMaxBarcodesCount = mMaxBarcodesCount, mMaxDimOfFullImageAsBarcodeZone = mMaxDimOfFullImageAsBarcodeZone, mPDFRasterDPI = mPDFRasterDPI, mRegionPredetectionMode = mRegionPredetectionMode, mReserved = mReserved, mScaleDownThreshold = mScaleDownThreshold, mTextFilterMode = mTextFilterMode, mTextureDetectionSensitivity = mTextureDetectionSensitivity, mTimeout = mTimeout)
  
    __obj.asInstanceOf[RunTimeSetting]
  }
}

