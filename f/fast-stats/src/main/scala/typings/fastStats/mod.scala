package typings.fastStats

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-stats", "Stats")
  @js.native
  open class Stats () extends StObject {
    def this(opts: StatsOpts) = this()
    
    /**
      * Arithmetic Mean
      * The arithmetic mean is calculated as the sum of all data points divided by the number of data points. This is useful for data sets that are fairly uniform, following a linear or binomial distribution. Use the amean() method or the ???()? method to get at it:
      */
    def amean(): Double = js.native
    
    /**
      * Band-pass filtering
      * The band_pass() filter method returns a new Stats object with all its data points within the specified range. This method takes in three arguments. The first is the lower bound of the range, the second is the upper bound of the range. Both these arguments are required.
      * The third argument specifies whether the range is open or closed. An open range does not include the upper and lower bounds while a closed range includes them. If not specified (or set to false), the range is closed. If set to true the range is open.
      * Band pass filtering should be used if the range for your data is rigid and never changes.
      */
    def band_pass(low: Double, high: Double): Stats = js.native
    def band_pass(low: Double, high: Double, open: Boolean): Stats = js.native
    
    /**
      * Fresh copy
      */
    def copy(): Stats = js.native
    
    /**
      * The distribution() method tells you how your data is distributed. You need to set the bucket_precision or buckets configuration options if you plan on using this method. It will then split your data into buckets based on the value of bucket_precision or buckets and tell you how many data points fall into each bucket. You can use this to plot a histogram of your data, or to compare it to commonly known distribution functions.
      * The return value is a sparse array of buckets with counts of datapoints per bucket. To save on memory, any empty buckets are undefined. You should treat an undefined bucket as if it had 0 datapoints.
      */
    def distribution(): js.Array[Bucket] = js.native
    
    /**
      * Geometric Mean
      * The geometric mean is the nth root of the product of all data points where n is the number of data points. This is useful for data sets that follow an exponential or log-normal distribution. Use the gmean() method to get at it:
      */
    def gmean(): Double = js.native
    
    /**
      * Geometric Standard Deviation
      * The geometric standard deviation tells you the spread of your data if it follows a log-normal or exponential distribution. Use the gstddev() method to get at it.
      */
    def gstddev(): Double = js.native
    
    /**
      * IQR Filtering
      * IQR, or Inter Quartile Range filtering filters data based on the spread of the data. It is much more adaptive to changes in data ranges. Use the iqr() method to IQR filter a dataset. The iqr() method does not accept any arguments.
      * In some cases, IQR filtering may not filter out anything. This can happen if the acceptable range is wider than the bounds of your dataset.
      */
    def iqr(): Stats = js.native
    
    /**
      * Number of elements
      */
    var length: Double = js.native
    
    /**
      * Maximum value of all data points
      */
    var max: Double | Null = js.native
    
    /**
      * Median
      * The median is the middle point of the dataset when sorted in ascending order. This is useful if your dataset has a lot of outliers and noise that would not normally be found in a complete population. Use the median() method to get at it:
      * If your data set contains an odd number of points, the median will be the middle point. If it contains an even number of points, then the median will be the arithmetic mean of the two middle points.
      * If your Stats object is configured to use buckets and has store_data set to false, then the median will be an approximation of the actual median.
      */
    def median(): Double = js.native
    
    /**
      * Minimun value of all data points
      */
    var min: Double | Null = js.native
    
    /**
      * 95% Confidence Margin of Error
      * The Margin of Error value tells you the range within which the real arithmetic mean of the population is likely to be with 95% confidence. Use the moe() method to get at it.
      * This value suggests that we are 95% certain that the real mean of the population is within 2.60 of the calculated arithmetic mean of 4.67. We could use this to find out the percent error in our sample. In this case there is a 55.71% error.
      * The margin of error is inversely proportional to the square root of the number of data points, so increasing the size of your sample will reduce the margin of error. It is good to strive for a margin of error of less than 5%.
      */
    def moe(): Double = js.native
    
    /**
      * Any Percentile
      * You can also get at any percentile value within the data. Use the percentile() method to get at this data. The percentile() method takes in a single argument. This is a number between 0 and 100 (both inclusive) that specifies which percentile point you want.
      * Passing in 50 as an argument will return the median, while 25 and 75 will return the first and third quartiles respectively. These three special values may be arithmetic means of two other values within the set. All other arguments will return a number from the data set.
      * If your Stats object is configured to use buckets and has store_data set to false, then the percentile value returned will be an approximation of the actual percentile based on the configured bucket_precision or buckets.
      */
    def percentile(n: Double): Double = js.native
    
    /**
      * Remove element from back
      */
    def pop(): Double = js.native
    
    /**
      * Add elements to back
      */
    def push(args: Double*): Stats = js.native
    def push(args: js.Array[Double]): Stats = js.native
    
    /**
      * Range
      * The range() method tells you the minimum and maximum values of your data set. It returns an array of two values. The first is the lower bound and the second is the upper bound.
      */
    def range(): js.Array[Double] = js.native
    
    /**
      * Clear all data
      */
    def reset(): Unit = js.native
    
    /**
      * Remove element from front
      */
    def shift(): Double = js.native
    
    /**
      * Arithmetic Standard Deviation
      * Also commonly just called the Standard Deviation, with the symbol s. This tells you the spread of your data if it follows a normal (or close to normal) distribution, ie, the bell curve. fast-stats is really fast at calculating the standard deviation of a dataset
      * The arithmetic standard deviation is used in conjunction with the arithmetic mean to tell you the spread of your dataset: [amean-stddev, amean+stddev]. Note that you could also use 2 or 3 standard deviations for different spreads.
      */
    def stddev(): Double = js.native
    
    /**
      * Sum of all data points
      */
    var sum: Double = js.native
    
    /**
      * Sum of the log values of all data points
      */
    var sum_of_logs: Double = js.native
    
    /**
      * Sum of the squares of the log values of all data points
      */
    var sum_of_square_of_logs: Double = js.native
    
    /**
      * Sum of the squares of all data points
      */
    var sum_of_squares: Double = js.native
    
    /**
      * Add elements to front
      */
    def unshift(args: Double*): Stats = js.native
    
    /**
      * Count of all data points equal to zero
      */
    var zeroes: Double = js.native
  }
  
  trait Bucket extends StObject {
    
    /**
      * Bucket midpoint
      */
    var bucket: Double
    
    /**
      * Number of datapoints
      */
    var count: Double
    
    /**
      * [<bucket low>, <bucket high>],
      */
    var range: js.Array[Double]
  }
  object Bucket {
    
    inline def apply(bucket: Double, count: Double, range: js.Array[Double]): Bucket = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bucket]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bucket] (val x: Self) extends AnyVal {
      
      inline def setBucket(value: Double): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value*))
    }
  }
  
  trait StatsOpts extends StObject {
    
    /**
      * Tells fast-stats how to extend the pre-defined buckets if data exceeding the range is added. This is useful to capture data above your range, in multiple buckets, but with low precision so you do not end up with a large number of empty buckets.
      * By default this is not defined, so buckets will not be extended and all data beyond the end range will end up in the last bucket.
      */
    var bucket_extension_interval: js.UndefOr[Double] = js.undefined
    
    /**
      * Tells fast-stats to maintain a histogram of your dataset using this parameter as the least count, or precision.
      * By default, fast-stats will not maintain buckets since it does not know the least count and range of your dataset in advance.
      * This option is required if you need to use the distribution() method.
      */
    var bucket_precision: js.UndefOr[Double] = js.undefined
    
    /**
      * Tells fast-stats to maintain a histogram of your dataset using these custom buckets.
      * Each number in the array is the upper limit of a bucket. The lower limit of the first bucket is 0, the lower limit for all other buckets is the upper limit of the previous bucket.
      * If you use both bucket_precision and buckets, buckets takes precedence.
      */
    var buckets: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Tells fast-stats whether the data you pass in is a sample (true) or the entire (false default) population.
      * The standard deviation algorithm differs for populations v/s samples.
      */
    var sampling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Tells fast-stats not to store actual data values. This is useful to reduce memory utilisation for large datasets, however it comes with a few caveats.
      * - You can no longer get an exact median or other percentile value out of your dataset, however you could use bucketing (see bucket_precision above) to get an approximate percentile value.
      * - You can no longer run an exact iqr filter or a band_pass filter on the data, however you could use bucketing to get an approximate filtered object.
      * - You can no longer get at the entire dataset or remove data from the dataset.
      * The mean, standard deviation and margin of error calculations are unaffected by this parameter. If you use bucketing, and only care about the mean, standard deviation and margin of error or an approximate median or percentile value, set this option to false.
      * By default, store_data is true.
      */
    var store_data: js.UndefOr[Boolean] = js.undefined
  }
  object StatsOpts {
    
    inline def apply(): StatsOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatsOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatsOpts] (val x: Self) extends AnyVal {
      
      inline def setBucket_extension_interval(value: Double): Self = StObject.set(x, "bucket_extension_interval", value.asInstanceOf[js.Any])
      
      inline def setBucket_extension_intervalUndefined: Self = StObject.set(x, "bucket_extension_interval", js.undefined)
      
      inline def setBucket_precision(value: Double): Self = StObject.set(x, "bucket_precision", value.asInstanceOf[js.Any])
      
      inline def setBucket_precisionUndefined: Self = StObject.set(x, "bucket_precision", js.undefined)
      
      inline def setBuckets(value: js.Array[Double]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
      
      inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
      
      inline def setBucketsVarargs(value: Double*): Self = StObject.set(x, "buckets", js.Array(value*))
      
      inline def setSampling(value: Boolean): Self = StObject.set(x, "sampling", value.asInstanceOf[js.Any])
      
      inline def setSamplingUndefined: Self = StObject.set(x, "sampling", js.undefined)
      
      inline def setStore_data(value: Boolean): Self = StObject.set(x, "store_data", value.asInstanceOf[js.Any])
      
      inline def setStore_dataUndefined: Self = StObject.set(x, "store_data", js.undefined)
    }
  }
}
